package com.hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.FloorPojo;
import com.model.HotelPojo;
import com.model.RoomPojo;

public class HotelStore {
	private static Map<String, HotelPojo> availableHotels = new HashMap<String, HotelPojo>();

	public static Map<String, HotelPojo> getAvailableHotels() {
		return availableHotels;
	}

	public static HotelPojo getHotelById(String hotelName) {
		return availableHotels.get(hotelName);
	}
	
	static {
		availableHotels.put("ibs", createHotel());

	}

	private static HotelPojo createHotel() {

		HotelPojo hotel = new HotelPojo();
		hotel.setHotelId("ibs");
		hotel.setHotelName("ibs");

		List<FloorPojo> floors = new ArrayList<FloorPojo>();
		FloorPojo floor1 = new FloorPojo();
		FloorPojo floor2 = new FloorPojo();
		FloorPojo floor3 = new FloorPojo();
		floor1.setFloorNo(1);

		List<RoomPojo> floor1_rooms = new ArrayList<RoomPojo>();
		RoomPojo room1 = new RoomPojo();
		room1.setRoomNo("A");
		room1.setRoomType("Normal");
		room1.setBookedStatus(false);

		RoomPojo room2 = new RoomPojo();
		room2.setRoomNo("B");
		room2.setRoomType("Normal");
		room2.setBookedStatus(false);

		RoomPojo room3 = new RoomPojo();
		room3.setRoomNo("C");
		room3.setRoomType("Normal");
		room3.setBookedStatus(false);

		floor1_rooms.add(room1);
		floor1_rooms.add(room2);
		floor1_rooms.add(room3);

		floor1.setRooms(floor1_rooms);

		List<RoomPojo> floor2_rooms = new ArrayList<RoomPojo>();
		RoomPojo room4 = new RoomPojo();
		room4.setRoomNo("D");
		room4.setRoomType("Normal");
		room4.setBookedStatus(false);

		RoomPojo room5 = new RoomPojo();
		room5.setRoomNo("E");
		room5.setRoomType("Normal");
		room5.setBookedStatus(false);

		RoomPojo room6 = new RoomPojo();
		room6.setRoomNo("F");
		room6.setRoomType("Normal");
		room6.setBookedStatus(false);

		floor2_rooms.add(room5);
		floor2_rooms.add(room5);
		floor2_rooms.add(room6);

		floor2.setRooms(floor2_rooms);

		floors.add(floor2);

		List<RoomPojo> floor3_rooms = new ArrayList<RoomPojo>();
		RoomPojo room7 = new RoomPojo();
		room7.setRoomNo("G");
		room7.setRoomType("Normal");
		room7.setBookedStatus(false);

		RoomPojo room8 = new RoomPojo();
		room8.setRoomNo("H");
		room8.setRoomType("Normal");
		room8.setBookedStatus(false);

		RoomPojo room9 = new RoomPojo();
		room9.setRoomNo("I");
		room9.setRoomType("Normal");
		room9.setBookedStatus(false);

		floor3_rooms.add(room7);
		floor3_rooms.add(room8);
		floor3_rooms.add(room9);

		floor3.setRooms(floor3_rooms);

		floors.add(floor3);

		hotel.setFloors(floors);

		return hotel;
	}

}
