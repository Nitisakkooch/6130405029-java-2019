package koochaiyaphum.nitisak.lab4;
import com.sun.tools.javac.Main;

public class HondaAuto extends Automobile implements Moveable, Refuelable  {
	public HondaAuto(int maximumspeed, int acceleration, String model) {

		this.setAcceleration(acceleration);
		this.setMaxSpeed(maximumspeed);
		this.setModel(model);
		this.setGasoline(100);

	}
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpeed() {
		// TODO Auto-generated method stub
		
	}

}
