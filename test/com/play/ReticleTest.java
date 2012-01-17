package com.play;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class ReticleTest {
	
	@Test
	public void live_cell_with_fewer_than_two_live_neighbours_dies(){
		Reticle recticle = new Reticle();
		Cell liveCell = new LiveCell();
		
		List<Cell> neighbours = new ArrayList<Cell>();
		Cell liveCell1 = new LiveCell();
		Cell liveCell2 = new DeadCell();
		neighbours.add(liveCell1);
		neighbours.add(liveCell2);
		
		Assert.assertFalse("Less than 2 live neighbours dies..", recticle.findLivingCell(liveCell, neighbours));
	}
	
	@Test
	public void live_cell_with_greater_than_three_live_neighbours_dies(){
		Reticle recticle = new Reticle();
		Cell liveCell = new LiveCell();
		
		List<Cell> neighbours = new ArrayList<Cell>();
		Cell liveCell1 = new LiveCell();
		Cell liveCell2 = new LiveCell();
		Cell liveCell3 = new LiveCell();
		Cell liveCell4 = new LiveCell();
		neighbours.add(liveCell1);
		neighbours.add(liveCell2);
		neighbours.add(liveCell3);
		neighbours.add(liveCell4);
		
		Assert.assertFalse("More than 3 live neighbours dies..", recticle.findLivingCell(liveCell, neighbours));
	}
	
	
	@Test
	public void live_cell_with_two_live_neighbours_lives(){
		Reticle recticle = new Reticle();
		Cell liveCell = new LiveCell();
		
		List<Cell> neighbours = new ArrayList<Cell>();
		Cell liveCell1 = new LiveCell();
		Cell liveCell2 = new LiveCell();
		neighbours.add(liveCell1);
		neighbours.add(liveCell2);
		
		Assert.assertTrue("Exact 2 live neighbours lives..", recticle.findLivingCell(liveCell, neighbours));
	}
	
	
	@Test
	public void live_cell_with_three_live_neighbours_lives(){
		Reticle recticle = new Reticle();
		Cell liveCell = new LiveCell();
		
		List<Cell> neighbours = new ArrayList<Cell>();
		Cell liveCell1 = new LiveCell();
		Cell liveCell2 = new LiveCell();
		Cell liveCell3 = new LiveCell();
		neighbours.add(liveCell1);
		neighbours.add(liveCell2);
		neighbours.add(liveCell3);
		
		Assert.assertTrue("Exact 3 live neighbours lives..", recticle.findLivingCell(liveCell, neighbours));
	}
	
	@Test
	public void dead_cell_with_less_than_two_live_neighbours_remains_dead(){
		Reticle recticle = new Reticle();
		Cell deadCell = new DeadCell();
		
		List<Cell> neighbours = new ArrayList<Cell>();
		Cell liveCell1 = new LiveCell();
		neighbours.add(liveCell1);
		
		Assert.assertFalse("Dead Cell with less than two live neighbours remains dead..", recticle.findDeadCell(deadCell, neighbours));
	}
	
	@Test
	public void dead_cell_with_more_than_three_live_neighbours_remains_dead(){
		Reticle recticle = new Reticle();
		Cell deadCell = new DeadCell();
		
		List<Cell> neighbours = new ArrayList<Cell>();
		Cell liveCell1 = new LiveCell();
		Cell liveCell2 = new LiveCell();
		Cell liveCell3 = new LiveCell();
		Cell liveCell4 = new LiveCell();
		neighbours.add(liveCell1);
		neighbours.add(liveCell2);
		neighbours.add(liveCell3);
		neighbours.add(liveCell4);
		
		Assert.assertFalse("Dead Cell with more than three live neighbours remains dead..", recticle.findDeadCell(deadCell, neighbours));
	}
	
	@Test
	public void dead_cell_with_three_live_neighbours_becomes_live(){
		Reticle recticle = new Reticle();
		Cell deadCell = new DeadCell();
		
		List<Cell> neighbours = new ArrayList<Cell>();
		Cell liveCell1 = new LiveCell();
		Cell liveCell2 = new LiveCell();
		Cell liveCell3 = new LiveCell();
		neighbours.add(liveCell1);
		neighbours.add(liveCell2);
		neighbours.add(liveCell3);
		
		Assert.assertTrue("Dead Cell with three live neighbours becomes live..", recticle.findDeadCell(deadCell, neighbours));
	}
	
	

}
