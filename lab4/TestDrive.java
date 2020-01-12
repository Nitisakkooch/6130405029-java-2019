package koochaiyaphum.nitisak.lab4;
import koochaiyaphum.nitisak.lab4.Automobile.Color;
public class TestDrive {
	public static void main(String[] args) {
		Automobile car1 = new Automobile(100, 0, 200, 0, "sport car", Color.RED);
		Automobile car2 = new Automobile(100, 0, 100, 0, "Electric car", Color.WHITE);
		System.out.println("Car 1's max speed is " + car1.getMaxSpeed());
		System.out.println("Car 2's max speed is " + car2.getMaxSpeed());
		car1.setMaxSpeed(280);
		System.out.println("Car 1's max speed has increased to  " + car1.getMaxSpeed());
		System.out.println("There are " + Automobile.getNumberOfAutomobile() + " automobile");
		Automobile car3 = new Automobile();
		System.out.println("Now there are " + Automobile.getNumberOfAutomobile() + " automobile");
		System.out.println(car1);
		System.out.println(car3);
	}
}
