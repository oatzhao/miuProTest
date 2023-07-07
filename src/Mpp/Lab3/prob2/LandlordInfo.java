package Mpp.Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings = new ArrayList<>();
    public void addBuilding(Building building){
        buildings.add(building);
    }
    public int calcProfits(){
        int total=0;
        for(Building building:buildings){
            List<Apartment> apartmentList = building.getApartmentList();
            for(Apartment apartment:apartmentList){
                int price = apartment.getPrice();
                total+=price;
            }
        }
        return total;
    }
}
