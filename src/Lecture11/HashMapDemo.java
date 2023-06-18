package Lecture11;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Keys");
        productMap.put(4, "Books");
        productMap.put(3, "Systems");
        productMap.put(7, "Mobile");

        System.out.println(productMap.containsKey(4));
        System.out.println(productMap.get(null));
        System.out.println(productMap.containsValue("Books"));

        productMap.put(7, "Samsung");
        productMap.put(7, "Samsung1");

        productMap.put(null, "Apple");
        productMap.put(null, "AppleMac");
        System.out.println(productMap);
    }
}
