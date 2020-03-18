package io.github.hedi_guedidi.moveit;

public interface MovableObject {
	public boolean canAccelerate();
	public void accelerate();
	public double getTimeToMove(double dist);
	public void brake();
	

}
