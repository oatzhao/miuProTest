package FPP.Lecture6.local;

import java.util.Arrays;
import java.util.Comparator;

public class PersonData {
    public static void main(String[] args){
        PersonData pd = new PersonData();
        Person[] people = prepareData();
        pd.sort(people);
        System.out.println(Arrays.toString(people));
    }

    private void sort(Person[] people){
        class NameComparator implements Comparator<Person>{
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        }
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
