package FPP.Lecture11;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Swing");
        set.add("Java Spring");
        set.add("Banana");
        System.out.println(set);
        System.out.println("Removed Java form the set" + set.remove("Java"));
        System.out.println("Set contains Swing:" + set.contains("Swing"));
        System.out.println("");

        HashSet<Object> obj = new HashSet<>();
        obj.add("Java");

        if(obj.add("Java"))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
