package com.model;

public class RoomPojo {

	private String roomNo;
	private String roomType;
	private boolean bookedStatus;
	
	public boolean isBookedStatus() {
		return bookedStatus;
	}
	public void setBookedStatus(boolean bookedStatus) {
		this.bookedStatus = bookedStatus;
	}
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	@Override
	public String toString() {
		return "RoomPojo [roomNo=" + roomNo + ", roomType=" + roomType + ", bookedStatus=" + bookedStatus + "]";
	}
}
