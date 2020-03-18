package io.github.hedi_guedidi.moveit;

public class MovableUser {
	public static double getTotalTime(MovableObject movable) {
		double res1=movable.getTimeToMove(1);
		movable.brake();
		double res2=movable.getTimeToMove(0.1);
		movable.accelerate();
		double res3=movable.getTimeToMove(1);
		return res1+res2+res3;
	}
	
	public static void main(String[] args) {
	ConstantSpeedMovable cons=new ConstantSpeedMovable();
	GenericMovable gen1=new GenericMovable();
	GenericMovable gen2=new GenericMovable();
	gen2.accelerate();
	System.out.println("time to accelerate cons : "+cons.getTimeToMove(1));
	System.out.println("time to accelerate gen1 : "+gen1.getTimeToMove(1));
	System.out.println("total time  gen2 : "+gen2.getTimeToMove(1));
	System.out.println("total time cons : "+getTotalTime(cons));
	System.out.println("total time gen1 : "+getTotalTime(gen1));
	System.out.println("total time gen2 : "+getTotalTime(gen2));
	
	}

}
