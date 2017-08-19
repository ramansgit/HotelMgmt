package com.test;

import com.users.UserBookingInterface;
import com.users.UserBookingServiceImpl;

public class TestUserBookingService {

	public static void main(String[] args) {
		checkIn("sathish", 5);
		checkOut("sathish", 5);
		
	}

	public static void checkIn(String username, int noOfRooms) {
		UserBookingInterface service = new UserBookingServiceImpl();

		boolean status = service.checkIn("sathish", 5,"ibs");

		if (status) {
			System.out.println("Room Booked Successfully");
		} else {
			System.out.println("Room Booked Failed");
		}
	}

	public static void checkOut(String username, int noOfRooms) {
		UserBookingInterface service = new UserBookingServiceImpl();

		boolean status = service.checkOut("sathish", 5,"ibs");

		if (status) {
			System.out.println("Room checkedout Successfully");
		} else {
			System.out.println("Room checkout Failed");
		}
	}

}
