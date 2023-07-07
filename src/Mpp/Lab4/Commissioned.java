package Mpp.Lab4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    private List<Order> orderList = new ArrayList<>();

    public double calcGrossPay(){
        return orderList.size()*commission+baseSalary;
    }

}
