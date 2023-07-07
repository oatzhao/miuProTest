package Mpp.Lab2.prob2B;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private LocalDate orderDate;
    private List<OrderLine> orderLines;

    Order(int orderNum) {
        this.orderNum = orderNum;
        orderLines = new ArrayList<OrderLine>();
    }

    public OrderLine addOrderLine(){
        OrderLine orderLine = new OrderLine();
        orderLines.add(orderLine);
        return orderLine;
    }

    public List<OrderLine> getOrderLines(){
        return orderLines;
    }

    @Override
    public String toString(){
        return "orderNum : " + orderNum;
    }
}
