package com.example.clone.shallowcopy;

public class CustUser implements Cloneable{
    private String firstName;
    private String lastName;
    private Address address;
    private String[] cars;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getCars() {
        return cars;
    }

    public void setCars(String[] cars) {
        this.cars = cars;
    }
}
