package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservation extends HotelReservationIF {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel;

    public boolean addHotel(String hotelNumber, String hotelName, int weekDayRates, int weekedDayRates) {
        hotel = new Hotel();
        hotel.setHotelNumber(hotelNumber);
        hotel.setHotelName(hotelName);
        hotel.setWeekDayRates(weekDayRates);
        hotel.setWeekendDayRates(weekedDayRates);
        hotelList.add(hotel);
        System.out.println("Successfully Added.");
        return true;
    }
    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

}
