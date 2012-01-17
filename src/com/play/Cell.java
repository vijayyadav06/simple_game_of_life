package com.play;

import java.util.List;

public interface Cell {

	public boolean isAlive();

	public List<Cell> getNeighbors();
	
}
