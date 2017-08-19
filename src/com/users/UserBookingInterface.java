package com.users;


public interface UserBookingInterface {

	/**
	 * allows users to reserve rooms in a hotel
	 * @param userId
	 * @param noOfRooms
	 * @return
	 */
	public boolean checkIn(String userId, int noOfRooms,String hotelName);
	
	
	/**
	 * allows user to checkout from hotel 
	 * @param userId
	 * @param noOfRooms
	 * @return
	 */
	public boolean checkOut(String userId, int noOfRooms,String hotelName);
}
