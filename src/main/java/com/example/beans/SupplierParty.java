package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupplierParty
{
	@JsonProperty("supplierID")
    private String supplierID;

    public void setSupplierID(String supplierID){
        this.supplierID = supplierID;
    }
    public String getSupplierID(){
        return this.supplierID;
    }
}