package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address
{
	@JsonProperty("farID")
    private String farID;

	@JsonProperty("typeOfAddress")
    private String typeOfAddress;

	@JsonProperty("street")
    private String street;

	@JsonProperty("coAddress")
    private String coAddress;

	@JsonProperty("houseNumber")
    private String houseNumber;

	@JsonProperty("postalCode")
    private String postalCode;

	@JsonProperty("cityName")
    private String cityName;

    public void setFarID(String farID){
        this.farID = farID;
    }
    public String getFarID(){
        return this.farID;
    }
    public void setTypeOfAddress(String typeOfAddress){
        this.typeOfAddress = typeOfAddress;
    }
    public String getTypeOfAddress(){
        return this.typeOfAddress;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }
    public void setCoAddress(String coAddress){
        this.coAddress = coAddress;
    }
    public String getCoAddress(){
        return this.coAddress;
    }
    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }
    public String getHouseNumber(){
        return this.houseNumber;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public String getPostalCode(){
        return this.postalCode;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public String getCityName(){
        return this.cityName;
    }
}