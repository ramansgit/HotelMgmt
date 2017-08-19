package com.hotel.floorstratergy;

import java.util.List;

import com.hotel.HotelStore;
import com.model.FloorPojo;
import com.model.HotelPojo;
import com.model.RoomPojo;

public class TopFloorStratergy implements FloorSelectorStratergy {

	@Override
	public void floorSelector(String userId, int noOfRooms,String hotelName) {
		HotelPojo hotel = HotelStore.getHotelById(hotelName);
		
		if(hotel !=null){
			List<FloorPojo> floors = hotel.getFloors();
			floors.sort(new TopFloorSortingByFloorId());
			for(FloorPojo floor : floors){
				List<RoomPojo> rooms = floor.getRooms();
				for(RoomPojo room : rooms ){					
					if(room.isBookedStatus()){
						room.setBookedStatus(true);
					}
				}
			}
		}
	
	}

}
