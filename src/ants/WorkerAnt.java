package ants;

import lejos.hardware.port.SensorPort;

public class WorkerAnt extends AntBaseClass {

	/**
	 * Will spiral out from origin in the most efficient search pattern possible
	 */
	public void search() {

	}

	/**
	 * Will follow a found color trail to a POI
	 */
	public void followTrail() {

	}

	/**
	 * Will draw a color trail back home to POI for other ants to follow
	 */
	public void makeTrail() {

	}

}


class LookForColor implements Runnable {
	public void run(){
		//Set up color sensor
		ColorSensor cs = new ColorSensor(SensorPort.S3);
		
	}
}