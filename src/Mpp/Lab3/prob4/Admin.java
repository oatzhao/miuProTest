package Mpp.Lab3.prob4;

public class Admin {
    public static double computeTotalRent(Building[] buildings) {
        double totalRent = 0;
        for (Building o : buildings) {
//            if (o instanceof House) {
//                House h = (House) o;
//                totalRent += h.computeRent();
//            }
//            else if (o instanceof Condo) {
//                Condo h = (Condo) o;
//                totalRent += h.computeRent();
//            }
//            else if (o instanceof Trailer) {
//                Trailer h = (Trailer) o;
//                totalRent += h.computeRent();
//            }
            totalRent += o.computeRent();
        }
        return totalRent;
    }
}
