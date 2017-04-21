package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(500,500);
	sleep(2000);
	driveDirect(100,500);
	sleep(500);
	driveDirect(500,500);
	sleep(2000);
	driveDirect(500,100);
	sleep(500);
	driveDirect(500,500);
	sleep(1500);
	driveDirect(200,500);
	sleep(800);
	driveDirect(500,500);
	}

	public void loop() {
	
	}
}
