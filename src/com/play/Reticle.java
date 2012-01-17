package com.play;

import java.util.List;

public class Reticle {

	public boolean findLivingCell(Cell liveCell, List<Cell> neighbours) {
		int count = 0;
		if (neighbours.size() >= 2 && liveCell instanceof LiveCell) {
			for (Cell cell : neighbours) {
				if(cell instanceof LiveCell){
					count++;
				}
			}
			if(count <2 || count >3){
				return false;
			}else{
				return true;
			}
		}else{
			return false;
		}
	}

	public boolean findDeadCell(Cell deadCell, List<Cell> neighbours) {
		int count = 0;
		if (neighbours.size() >= 2 && deadCell instanceof DeadCell) {
			for (Cell cell : neighbours) {
				if(cell instanceof LiveCell){
					count++;
				}
			}
			if(count <2 || count >3){
				return false;
			}else if (count ==3){
				return true;
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
	
}
