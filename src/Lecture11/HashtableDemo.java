package Lecture11;

import java.util.Hashtable;
import java.util.Set;
public class HashtableDemo {
    public static void main(String[] args){
        Hashtable<Integer, Emple> tm = new Hashtable<Integer, Emple>();
        tm.put(1, new Emple(134, "Ramu", 3000));
        tm.put(5, new Emple(235, "jony", 6000));
        tm.put(3, new Emple(876, "Crish", 2000));
        tm.put(4, new Emple(512, "Tom", 2400));

        System.out.println("HashTable entries:");
        Set<Integer> keys = tm.keySet();
        for(Integer key: keys){
            System.out.println(key+"===>"+tm.get(key));
        }
        tm.remove(4);
        tm.replace(5, new Emple(235, "Jony", 3200));

        System.out.println(tm);
    }

    static class Emple{
        private String name;
        private int salary;
        private int id;

        public Emple(int id, String n, int s){
            this.id = id;
            this.name = n;
            this.salary = s;
        }

        @Override
        public String toString() {
            return "Emple{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", id=" + id +
                    '}';
        }
    }
}
