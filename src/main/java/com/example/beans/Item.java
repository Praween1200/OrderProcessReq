package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item
{
	@JsonProperty("productID")
    private String productID;

	@JsonProperty("description")
    private String description;

    public void setProductID(String productID){
        this.productID = productID;
    }
    public String getProductID(){
        return this.productID;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
}
