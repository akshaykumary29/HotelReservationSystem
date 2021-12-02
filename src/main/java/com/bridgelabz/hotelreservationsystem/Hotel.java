package com.bridgelabz.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private long regularCustomerCost;

    public Hotel() {
    }

    //Contructer
    public Hotel(String hotelName, long regularCustomerCost) {
        this.hotelName = hotelName;
        this.regularCustomerCost = regularCustomerCost;
    }

    //getter and setter Method
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public long getRegularCustomerCost() {
        return regularCustomerCost;
    }

    public void setRegularCustomerCost(long regularCustomerCost) {
        this.regularCustomerCost = regularCustomerCost;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", regularCustomerCost=" + regularCustomerCost +
                '}';
    }
}
