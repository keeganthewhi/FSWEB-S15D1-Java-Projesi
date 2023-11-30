package com.workintech.mobilephone;

public class Main {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("1234566789");
        phone.addNewContact(Contact.createContact("Bob","31415926"));
        phone.addNewContact(Contact.createContact("Alice","16180339"));
        phone.addNewContact(Contact.createContact("Tom","11235813"));
        phone.addNewContact(Contact.createContact("Jane","23571113"));

        phone.printContact();
        Contact emre = new Contact("Emre","12345");
        phone.addNewContact(emre);
        System.out.println(phone.findContact("Alice"));
        System.out.println(phone.findContact(emre));
    }
}
