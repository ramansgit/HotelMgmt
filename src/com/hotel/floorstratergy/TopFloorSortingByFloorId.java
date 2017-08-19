package com.hotel.floorstratergy;

import java.util.Comparator;

import com.model.FloorPojo;

public class TopFloorSortingByFloorId implements Comparator<FloorPojo>{


	@Override
	public int compare(FloorPojo o1, FloorPojo o2) {
		return o2.getFloorNo() - o1.getFloorNo();
	}
}
