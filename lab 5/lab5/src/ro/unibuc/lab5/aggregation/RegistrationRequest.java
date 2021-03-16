package ro.unibuc.lab5.aggregation;


/**
 * Aggregation
 * Those relationships whose objects have an independent lifecycle
 * and where there is no ownership between the abjects (both entities can survive individually
 * which means ending one entity will not affect the other entity.
 * <p>
 * Represents a Has-A relationship
 */
public class RegistrationRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // aggregation
    private Address address;

    public RegistrationRequest(String firstName, String lastName, String email, String phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
