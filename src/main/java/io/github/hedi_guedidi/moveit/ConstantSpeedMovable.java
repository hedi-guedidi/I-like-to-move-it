package io.github.hedi_guedidi.moveit;

public class ConstantSpeedMovable implements MovableObject{
	final private double speed=1;
	
	public boolean canAccelerate(){
		return false;
	}
	public void accelerate() {
	}
	public double getTimeToMove(double dist) {
		return(dist/speed);	
	}
	public void brake() {
	}
}
