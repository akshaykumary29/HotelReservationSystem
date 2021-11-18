package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

/**
 * Hotel Reservatiion System
 *
 * @author : Akshay
 * @version : 1.8
 * @since : 18/11/2021
 */

public class HotelReservation implements HotelReservationIF {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel;

    /**
     *
     * @param hotelNumber
     * @param hotelName
     * @param weekDayRates
     * @param weekedDayRates
     * @return
     */
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
