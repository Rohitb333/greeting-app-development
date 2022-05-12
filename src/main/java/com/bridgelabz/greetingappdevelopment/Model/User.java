package com.bridgelabz.greetingappdevelopment.Model;

public class User {
    private String firstName;
    private String lastName;

    public User() {

    }
    public User(User user) {
        this.firstName=user.firstName;
        this.lastName=user.lastName;
    }
    public String getfirstName() {
        return firstName;
    }
    public void setfName(String fName) {
        this.firstName = fName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lName) {
        this.lastName = lastName;
    }

}
