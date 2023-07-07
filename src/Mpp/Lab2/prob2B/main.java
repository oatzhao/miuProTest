package Mpp.Lab2.prob2B;

public class main {
    public static void main(String[] args) {
        Order order = new Order(5);
        OrderLine orderLine = order.addOrderLine();
        System.out.println(order.getOrderLines());
    }
}
