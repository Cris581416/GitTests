package psuedomotor;
import psuedomotor.Motor;

public class ArcadeDrive {
	
	private Motor motor1, motor2;
	
	public ArcadeDrive(Motor motor1, Motor motor2) {
		this.motor1 = motor1;
		this.motor2 = motor2;
	}
	
	public void set(double throttle, double turn){
		motor1.setSpeed();
		motor2.setSpeed();
	}
}
