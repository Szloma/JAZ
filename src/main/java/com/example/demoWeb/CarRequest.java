package com.example.demoWeb;

public class CarRequest {
    private String brand;
    private String name;
    private String segment;

    public CarRequest(){

    }
    public CarRequest(String brand, String name, String segment){
        this.brand = brand;
        this.name = name;
        this.segment = segment;
    }
    public String getName(){
        return this.name;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getSegment(){
        return this.segment;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setSegment(String segment){
        this.segment = segment;
    }
}
