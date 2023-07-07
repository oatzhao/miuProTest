package Mpp.Lab3.prob4;

public class Driver {
    public static void main(String[] args) {

        Building[] buildings = { new House(400), new Condo(2), new Trailer() };
        double totalRent = Admin.computeTotalRent(buildings);
        System.out.println(totalRent);
    }
}
