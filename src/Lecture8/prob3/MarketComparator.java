package Lecture8.prob3;

import java.util.Comparator;

public class MarketComparator implements Comparator<Marketing> {
    @Override
    public int compare(Marketing m1, Marketing m2) {
        if(m1.getSalesamount() == m2.getSalesamount()){
            return 0;
        }else if(m1.getSalesamount() > m2.getSalesamount()){
            return 1;
        }
        return -1;
    }
}
