package com.play;

import java.util.ArrayList;
import java.util.List;

public class LiveCell implements Cell {

	@Override
	public boolean isAlive() {
		return true;
	}

	public DeadCell dies() {
		return new DeadCell();
	}

	@Override
	public List<Cell> getNeighbors() {
		List<Cell> l1 = new ArrayList<Cell>();
		
		return l1;
	}
}
