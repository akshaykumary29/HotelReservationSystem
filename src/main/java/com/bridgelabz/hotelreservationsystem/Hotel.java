package com.bridgelabz.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private String hotelNumber;
    private int weekDayRates;
    private int WeekendDayRates;

    public Hotel() {
    }

//    //Contructer
//    public Hotel(String hotelNumber, String hotelName, int weekDayRates, int weekendDayRates) {
//        this.hotelName = hotelName;
//        this.hotelNumber = hotelNumber;
//        this.weekDayRates = weekDayRates;
//        this.WeekendDayRates = weekendDayRates;
//    }

    //getter and setter Method
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelNumber() {
        return hotelNumber;
    }

    public void setHotelNumber(String hotelNumber) {
        this.hotelNumber = hotelNumber;
    }

    public int getWeekDayRates() {
        return weekDayRates;
    }

    public void setWeekDayRates(int weekDayRates) {
        this.weekDayRates = weekDayRates;
    }

    public int getWeekendDayRates() {
        return WeekendDayRates;
    }

    public void setWeekendDayRates(int weekendDayRates) {
        WeekendDayRates = weekendDayRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelNumber='" + hotelNumber + '\'' +
                ", weekDayRates=" + weekDayRates +
                ", WeekendDayRates=" + WeekendDayRates +
                '}';
    }
}
