package entities;

/**
 * Created by Justin on 7/21/16.
 */
public class Owner {
    private Long ownerId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    //constructors


    public Owner() {

    }

    public Owner(Long ownerId, String firstName, String lastName, String phone, String address) {

    }

    // getters and setters

    public Long getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(Long ownerId) {

        this.ownerId = ownerId;
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

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }


}
