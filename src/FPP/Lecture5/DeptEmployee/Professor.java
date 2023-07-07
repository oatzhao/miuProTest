package FPP.Lecture5.DeptEmployee;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    Professor(String name, double salary, LocalDate date, int numberOfPublications){
        super(name, salary, date);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

}
