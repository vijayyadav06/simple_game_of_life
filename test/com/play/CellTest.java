package com.play;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class CellTest {

	@Test
	public void liveCellsAreAlive(){
		Cell cell = new LiveCell();
		Assert.assertTrue("isAlive", cell.isAlive());
	}
	
	@Test
	public void deadCellsAreNotAlive(){
		Cell cell = new DeadCell();
		Assert.assertFalse("Cell should be dead", cell.isAlive());
	}
	
	@Test
	public void whenAnAliveCellDiesItReturnsADeadCell(){
		LiveCell cell = new LiveCell();
		DeadCell deadCell = cell.dies();
		Assert.assertFalse(deadCell.isAlive());
	}
	
	@Test
	public void whenADeadCellComesToLifeItReturnsALiveCell() {
		DeadCell deadCell = new DeadCell();
		LiveCell liveCell = deadCell.born();
		Assert.assertTrue(liveCell.isAlive());
	}
	
	@Test
	public void cellsHaveNeighbors() {
		Cell deadCell = new DeadCell();
		Cell aliveCell = new LiveCell();
		
		List<Cell> aliveCellNeighbors = aliveCell.getNeighbors();
		Assert.assertNotNull(aliveCellNeighbors);
		List<Cell> deadCellNeighbors = deadCell.getNeighbors();
		Assert.assertNotNull(deadCellNeighbors);
	}
}