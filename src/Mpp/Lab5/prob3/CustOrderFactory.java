package Mpp.Lab5.prob3;

import java.time.LocalDate;
import java.util.List;

final public class CustOrderFactory {
    private CustOrderFactory(){}

    public static Customer createCustOrders(String name, LocalDate date){
        Customer customer = new Customer(name);
        Order order = Order.newOrder(customer, date);
        customer.addOrder(order);
        return customer;
    }
}
