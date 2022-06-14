package assignment;

import java.util.ArrayList;

public class mazeGenerator {

	private int size;
	private int[][] maze;
	private Random rand = new Random();
	
	public void mazeGenerator(){
		this.mazeGenerator(11);
	}
	
	public void mazeGenerator(int size){
		this.size = size;
		maze = new int[size][size];
	}
	
}
