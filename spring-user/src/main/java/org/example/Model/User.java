package org.example.Model;

public class User{

    private Long id;
    private String firstName;
    private String lastName;
    private UserAddress userAddress;

    public User() {
    }

    public User(Long id, String firstName, String lastName, UserAddress userAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAddress = userAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
}
