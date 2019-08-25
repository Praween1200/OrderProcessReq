package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationParty
{
	@JsonProperty("name")
    private String name;

	@JsonProperty("kurtID")
    private String kurtID;

	@JsonProperty("Contact")
    private Contact Contact;

	@JsonProperty("Address")
    private Address Address;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setKurtID(String kurtID){
        this.kurtID = kurtID;
    }
    public String getKurtID(){
        return this.kurtID;
    }
    public void setContact(Contact Contact){
        this.Contact = Contact;
    }
    public Contact getContact(){
        return this.Contact;
    }
    public void setAddress(Address Address){
        this.Address = Address;
    }
    public Address getAddress(){
        return this.Address;
    }
}

