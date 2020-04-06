package com.rejigl.spring5webapp.domain;

public class Address {

    private String address_line;
    private String city;
    private String state;
    private int zip;

    public Address(String city) {
        this.city = city;
    }

    public Address(String address_line, String city, String state, int zip) {
        this.address_line = address_line;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddress_line() {
        return address_line;
    }

    public void setAddress_line(String address_line) {
        this.address_line = address_line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
