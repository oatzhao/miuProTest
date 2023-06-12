package Lecture6.member;

import java.util.Arrays;
import java.util.Comparator;

public class PersonData {
    private class NameComparator implements Comparator<Person>{
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public static void main(String[] args){
        PersonData pd = new PersonData();
        Person[] people = prepareData();
        Arrays.sort(people, pd.new NameComparator());
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
