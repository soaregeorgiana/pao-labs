package ro.unibuc.lab5.aggregation;

public class Address {

    private String country;
    private String city;
    private String streetName;
    private int streetNumber;
    private int houseNumber;

    public Address(String country, String city, String streetName, int streetNumber, int houseNumber) {
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
