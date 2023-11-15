package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WaaOffensiveWords {
    private static final String[] OFFENSIVE_WORDS = {"spring"};

    @Before("execution(* com.example.demo.controller.*.*(..)) && args(text)")
    public void filterOffensiveWords(String text) {
        for (String word : OFFENSIVE_WORDS) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "******");
        }
        // You can log or handle the filtered text as needed
        System.out.println("Filtered Text: " + text);
    }
}
