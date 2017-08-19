package com.hotel;

import com.hotel.floorstratergy.BottomFloorStratergy;
import com.hotel.floorstratergy.FloorSelectorStratergy;
import com.hotel.floorstratergy.RandomFloorSelectorStratergy;
import com.hotel.floorstratergy.TopFloorStratergy;

public class HotelStoreManager implements HotelStoreInterface {

	public static HotelStoreManager instance = null;

	private static String floorSelector = "Top";

	private HotelStoreManager() {

	}

	/**
	 * single instance allowed
	 * 
	 * @return
	 */
	public static HotelStoreManager getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new HotelStoreManager();
				}
			}
		}
		return instance;
	}

	@Override
	public boolean checkIn(String userId, int noOfRooms, String hotelName) {
		FloorSelectorStratergy stratergy = null;
		if (floorSelector != null && floorSelector.equals("Top")) {
			stratergy = new TopFloorStratergy();
		} else if (floorSelector != null && floorSelector.equals("Random")) {
			stratergy = new RandomFloorSelectorStratergy();
		} else {
			stratergy = new BottomFloorStratergy();
		}

		stratergy.floorSelector(userId, noOfRooms, hotelName);

		return false;
	}

	@Override
	public boolean checkOut(String userId, int noOfRooms, String hotelName) {

		return false;
	}

}
