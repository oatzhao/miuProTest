package Lecture3;

class Address {
    String street;
    String city;
    String state;
    String zip;

    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String toString() {
        return "[street: "+ street + ", city:" + city + ", " + "state: " + state + "zip: " + zip+ "]";
    }

}