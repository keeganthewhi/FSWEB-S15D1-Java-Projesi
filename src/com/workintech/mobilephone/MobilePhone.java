package com.workintech.mobilephone;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts= new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact oldContact ,Contact newContact){
        if (myContacts.contains(oldContact)) {
            oldContact.setName(newContact.getName());
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            return true;
        }else{
            return false;
        }
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }else{
            myContacts.add(contact);
            return false;
        }
    }
    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    public int findContact(String name){
        for(Contact contact : myContacts){
            if(contact.getName().equals(name)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        for(Contact contact : myContacts){
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
    public void printContact(){
        for (Contact contact : myContacts){
            System.out.println((myContacts.indexOf(contact)+1)+". "+contact.getName()+"-> "+contact.getPhoneNumber());
        }
    }
}
