package com.bridgelabz.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private long weekDayRegularCustomerRate;
    private long weekendDayRegularCustomerRate;
    private int rate;

    public Hotel() {
    }

    //Contructer
    public Hotel(String hotelName, long weekDayRegularCustomerRate, long weekendDayRegularCustomerRate, int rate) {
        this.hotelName = hotelName;
        this.weekDayRegularCustomerRate = weekDayRegularCustomerRate;
        this.weekendDayRegularCustomerRate = weekendDayRegularCustomerRate;
        this.rate = rate;
    }

    // getter and setter
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public long getWeekDayRegularCustomerRate() {
        return weekDayRegularCustomerRate;
    }

    public void setWeekDayRegularCustomerRate(long weekDayRegularCustomerRate) {
        this.weekDayRegularCustomerRate = weekDayRegularCustomerRate;
    }

    public long getWeekendDayRegularCustomerRate() {
        return weekendDayRegularCustomerRate;
    }

    public void setWeekendDayRegularCustomerRate(long weekendDayRegularCustomerRate) {
        this.weekendDayRegularCustomerRate = weekendDayRegularCustomerRate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRegularCustomerRate=" + weekDayRegularCustomerRate +
                ", weekendDayRegularCustomerRate=" + weekendDayRegularCustomerRate +
                '}';
    }
}
