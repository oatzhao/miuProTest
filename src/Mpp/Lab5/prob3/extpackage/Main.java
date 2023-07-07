package Mpp.Lab5.prob3.extpackage;

import java.time.LocalDate;

import Mpp.Lab5.prob3.CustOrderFactory;
import Mpp.Lab5.prob3.Customer;
import Mpp.Lab5.prob3.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());

		Customer c0 = CustOrderFactory.createCustOrders("Y.Z", LocalDate.now());
		System.out.println(c0.getOrders());
	}
}

		
