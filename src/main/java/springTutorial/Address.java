package springTutorial;

/**
 * Created by Daniel_D'AGE on 26.07.2018.
 */
public class Address {
    private String locality;
    private String zipCode;
    private String street;
    private String streetNumber;


    public Address(String locality, String zipCode, String street, String streetNumber) {
        this.locality = locality;
        this.zipCode = zipCode;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "locality='" + locality + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}
