package com.bridgelabz.hotelreservationsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

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
     * @param hotelName
     * @param weekendDayRegularCustomerRate
     * @param weekDayRegularCustomerRate
     */
    public void addHotel(String hotelName, long weekDayRegularCustomerRate, long weekendDayRegularCustomerRate) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setWeekDayRegularCustomerRate(weekDayRegularCustomerRate);
        hotel.setWeekendDayRegularCustomerRate(weekendDayRegularCustomerRate);
        hotelList.add(hotel);
        System.out.println("Successfully Added.");
    }

    public int getHotelListSize() {
        return hotelList.size();
    }

    public void printHotelList() {
        for (Hotel list : hotelList) {
            System.out.println("\tHotel Details: " + list.getHotelName()
                    + "\t\tRates per regular Customer: " + "Week day Rate:" + list.getWeekDayRegularCustomerRate() + "$"
                    + "Weekend day Rate:" + list.getWeekendDayRegularCustomerRate() + "$");
        }
    }

    @Override
    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public Hotel getCheapestHotelOnWeekDay(LocalDate startDate, LocalDate endDate) {
        long numOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRegularCustomerRate));
        return sortedHotelList.get();
    }

    public Hotel getCheapestHotelOnWeekEndDay(LocalDate startDate, LocalDate endDate) {
        long numOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getWeekendDayRegularCustomerRate));
        return sortedHotelList.get();
    }
}
