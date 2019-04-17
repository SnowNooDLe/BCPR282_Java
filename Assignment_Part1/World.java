package nz.ac.ara.dos0311.Assignment.Part1;

public class World {
//	default status for music is playing.
	boolean musicStatus = true;
	int mazeLevel;
//	Constructor
	public World() {
//		initial level will always be 1
		this.mazeLevel = 1;
	}
	
//	Feature 1. Sound On / Off done
	public void soundOff() {
		this.musicStatus = false;
	}
	public void soundOn() {
		this.musicStatus = true;
	}
	

	
}
