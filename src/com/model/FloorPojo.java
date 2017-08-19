package com.model;

import java.util.List;

public class FloorPojo {

	private int floorNo;
	private List<RoomPojo> rooms;
	
	
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public List<RoomPojo> getRooms() {
		return rooms;
	}
	public void setRooms(List<RoomPojo> rooms) {
		this.rooms = rooms;
	}
	
	@Override
	public String toString() {
		return "FloorPojo [floorNo=" + floorNo + ", rooms=" + rooms + "]";
	}
}
