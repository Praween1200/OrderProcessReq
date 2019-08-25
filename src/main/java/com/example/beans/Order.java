package com.example.beans;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order
{
	@JsonProperty("OrderID")
    private OrderID OrderID;

	@JsonProperty("issueDate")
    private Date issueDate;

	@JsonProperty("orderType")
    private String orderType;

	@JsonProperty("typeOfOrder")
    private String typeOfOrder;
	
	@JsonProperty("SupplierParty")
    private SupplierParty SupplierParty;

	@JsonProperty("OrderLine")
    private OrderLine OrderLine;

    public void setOrderID(OrderID OrderID){
        this.OrderID = OrderID;
    }
    public OrderID getOrderID(){
        return this.OrderID;
    }
    public void setIssueDate(Date issueDate){
        this.issueDate = issueDate;
    }
    public Date getIssueDate(){
        return this.issueDate;
    }
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }
    public String getOrderType(){
        return this.orderType;
    }
    public void setTypeOfOrder(String typeOfOrder){
        this.typeOfOrder = typeOfOrder;
    }
    public String getTypeOfOrder(){
        return this.typeOfOrder;
    }
    public void setSupplierParty(SupplierParty SupplierParty){
        this.SupplierParty = SupplierParty;
    }
    public SupplierParty getSupplierParty(){
        return this.SupplierParty;
    }
    public void setOrderLine(OrderLine OrderLine){
        this.OrderLine = OrderLine;
    }
    public OrderLine getOrderLine(){
        return this.OrderLine;
    }
}
