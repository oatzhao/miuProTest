package Lecture8.prob3;

import java.util.Comparator;

public class MarketComparator implements Comparator<Marketing> {
    @Override
    public int compare(Marketing m1, Marketing m2) {
       return m1.getSalesamount().compareTo(m2.getSalesamount());
    }
}
