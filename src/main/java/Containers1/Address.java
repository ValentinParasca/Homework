package Containers1;

public class Address {
    private String country;

    public Address(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                '}';
    }
}
