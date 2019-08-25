package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactName
{
	@JsonProperty("lastName")
    private String lastName;

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
}