package _14_OOP._5_encaupsulation;

public class Address {

    public String country;
    public String city;
    public String district;
    public String street;
    public int house;

    public Address(String country, String city, String district, String street, int house) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}

