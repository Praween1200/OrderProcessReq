package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact
{
	@JsonProperty("ContactName")
    private ContactName ContactName;

	@JsonProperty("phone")
    private String phone;

    public void setContactName(ContactName ContactName){
        this.ContactName = ContactName;
    }
    public ContactName getContactName(){
        return this.ContactName;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
}
