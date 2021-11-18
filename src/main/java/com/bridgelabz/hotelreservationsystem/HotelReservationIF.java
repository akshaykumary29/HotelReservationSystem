package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public interface HotelReservationIF {
    public boolean addHotel(String hotelNumber, String hotelName, int weekDayRates, int weekedDayRates);

    public ArrayList<Hotel> getHotelList();


}
