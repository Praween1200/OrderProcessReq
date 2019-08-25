package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderClass
{
	@JsonProperty("Order")
    private Order Order;

    public void setOrder(Order Order){
        this.Order = Order;
    }
    public Order getOrder(){
        return this.Order;
    }
}
