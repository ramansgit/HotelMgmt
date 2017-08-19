package com.hotel.floorstratergy;

import java.util.Comparator;

import com.model.FloorPojo;

public class BottomFloorSortingByFloorId implements Comparator<FloorPojo> {

	@Override
	public int compare(FloorPojo o1, FloorPojo o2) {
		return o1.getFloorNo() - o2.getFloorNo();
	}

}
