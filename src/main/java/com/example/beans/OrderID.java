package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderID
{
	@JsonProperty("systemID")
    private String systemID;

	@JsonProperty("bookingID")
    private String bookingID;

	@JsonProperty("groupID")
    private String groupID;

    public void setSystemID(String systemID){
        this.systemID = systemID;
    }
    public String getSystemID(){
        return this.systemID;
    }
    public void setBookingID(String bookingID){
        this.bookingID = bookingID;
    }
    public String getBookingID(){
        return this.bookingID;
    }
    public void setGroupID(String groupID){
        this.groupID = groupID;
    }
    public String getGroupID(){
        return this.groupID;
    }
}