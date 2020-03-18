package io.github.hedi_guedidi.moveit;

public class GenericMovable implements MovableObject {
	private double speed=1;
	
	public boolean canAccelerate(){
		return true;
	}
	public void accelerate() {
		speed=speed+0.5;	
	}
	public double getTimeToMove(double dist) {
		return(dist/speed);	
	}
	public void brake() {
		if(speed>0) {
			speed=speed-0.5;
		}
	}
}
