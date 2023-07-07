package Mpp.Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private List<Apartment> apartmentList = new ArrayList<>();

    Building(String name){
        this.name =name;
    }

    public void addApartment(Apartment apartment){
        apartmentList.add(apartment);
    }
    public List getApartmentList(){
        return this.apartmentList;
    }
}
