package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLine
{
	@JsonProperty("orderLineID")
    private String orderLineID;

	@JsonProperty("resourceID")
    private String resourceID;

	@JsonProperty("DestinationParty")
    private DestinationParty DestinationParty;

	@JsonProperty("Item")
    private Item Item;

    public void setOrderLineID(String orderLineID){
        this.orderLineID = orderLineID;
    }
    public String getOrderLineID(){
        return this.orderLineID;
    }
    public void setResourceID(String resourceID){
        this.resourceID = resourceID;
    }
    public String getResourceID(){
        return this.resourceID;
    }
    public void setDestinationParty(DestinationParty DestinationParty){
        this.DestinationParty = DestinationParty;
    }
    public DestinationParty getDestinationParty(){
        return this.DestinationParty;
    }
    public void setItem(Item Item){
        this.Item = Item;
    }
    public Item getItem(){
        return this.Item;
    }
}