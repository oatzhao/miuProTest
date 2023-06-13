package Lecture6;

import java.util.Arrays;

public class prepareData {
    public static void main(String[] args){
        Person[] people = prepareData();
        Arrays.sort(people, new NameComparator());
        System.out.println(Arrays.toString(people));
    }

    static Person[] prepareData(){
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Anna")
        };
        return people;
    }
}
