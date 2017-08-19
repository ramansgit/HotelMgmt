package com.users;

import com.hotel.HotelStoreInterface;
import com.hotel.HotelStoreManager;

public class UserBookingServiceImpl implements UserBookingInterface {

	public HotelStoreInterface manager = HotelStoreManager.getInstance();

	@Override
	public boolean checkIn(String userId, int noOfRooms,String hotelName) {
		return manager.checkIn(userId, noOfRooms,hotelName);

	}

	@Override
	public boolean checkOut(String userId, int noOfRooms,String hotelName) {
		return manager.checkOut(userId, noOfRooms, hotelName);

	}

}
