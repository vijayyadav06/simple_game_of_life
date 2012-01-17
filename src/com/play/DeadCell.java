package com.play;

import java.util.ArrayList;
import java.util.List;

public class DeadCell implements Cell{

	@Override
	public boolean isAlive() {
		return false;
	}

	public LiveCell born() {
		return new LiveCell();
	}


	@Override
	public List<Cell> getNeighbors() {
		List<Cell> l1 = new ArrayList<Cell>();
		
		return l1;
	}
}
