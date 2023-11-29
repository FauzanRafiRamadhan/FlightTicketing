package com.smk.model;

public class Booking extends Model{
    private long id;

    private long scheduledId;

    private String name;

    private double price;

    public void setScheduleId(long scheduledId){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
