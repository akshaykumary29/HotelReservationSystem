package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public interface HotelReservationIF {
    public void addHotel(String hotelName, long regularCustomerRate);

    public int getHotelListSize();

    public void printHotelList();

    public ArrayList<Hotel> getHotelList();
}
