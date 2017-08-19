package com.model;

import java.util.List;

public class HotelPojo {
	private String hotelId;
	private String hotelName;
	private List<FloorPojo> floors;


	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public List<FloorPojo> getFloors() {
		return floors;
	}

	public void setFloors(List<FloorPojo> floors) {
		this.floors = floors;
	}

	
	@Override
	public String toString() {
		return "HotelPojo [hotelId=" + hotelId + ", hotelName=" + hotelName + ", floors=" + floors + "]";
	}


}
