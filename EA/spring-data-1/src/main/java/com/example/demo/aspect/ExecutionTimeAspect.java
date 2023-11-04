package com.example.demo.aspect;


import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
@Aspect
@RequiredArgsConstructor
public class ExecutionTimeAspect {
    @Autowired
    private DataSource dataSource;
    @Before("@annotation(com.example.demo.aspect.ExcutionTime)")
    public void logExecutionTime(ProceedingJoinPoint pcp) {
        long startTime = System.currentTimeMillis();
        try {
            pcp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        long duration = System.currentTimeMillis() - startTime;

        // Log to the ActivityLog table
        try (Connection connection = dataSource.getConnection()) {
            String methodName = pcp.getSignature().toShortString();
            String insertQuery = "INSERT INTO ActivityLog (date, operation, duration) VALUES (NOW(), ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, methodName);
                preparedStatement.setLong(2, duration);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
