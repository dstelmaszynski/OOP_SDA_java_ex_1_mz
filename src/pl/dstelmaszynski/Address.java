package pl.dstelmaszynski;

public class Address {
    private String street;
    private String city;
    private String country;
    private Integer flatNo;
    private Integer homeNo;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", flatNo=" + flatNo +
                ", homeNo=" + homeNo +
                '}';
    }

    public Address(String newStreet, String newCity, String newCountry, Integer newFlatNo, Integer newHomeNo){
        this.street = newStreet;
        this.city = newCity;
        this.country = newCountry;
        this.flatNo = newFlatNo;
        this.homeNo = newHomeNo;

    }
}
