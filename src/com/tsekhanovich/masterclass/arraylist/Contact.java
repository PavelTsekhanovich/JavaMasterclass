package com.tsekhanovich.masterclass.arraylist;

/**
 * @author Pavel Tsekhanovich 05.11.2018
 */

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact: " + name + ", phone: " + phoneNumber;
    }

    public static Contact createNewContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
