package org.kiwi.morphia;

public class Contact {
    private String location;
    private String phoneNumber;

    Contact() {

    }

    public Contact(String location, String phoneNumber) {
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
