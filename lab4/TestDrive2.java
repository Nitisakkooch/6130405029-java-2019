package koochaiyaphum.nitisak.lab4;

public class TestDrive2 {
	public static void main(String[] args) {
		ToyotaAuto car1 = new ToyotaAuto(200, 10, "Vios");
		HondaAuto car2 = new HondaAuto(220, 8, "City");
		
		System.out.println(car1);
		System.out.println(car2);
		
		car1.accelerate();
		car2.accelerate();
		car2.accelerate();
		
		System.out.println(car1);
		System.out.println(car2);
		
		car1.brake();
		car1.brake();
		car2.brake();
		
		System.out.println(car1);
		System.out.println(car2);
		
		car1.refuel();
		car2.refuel();
		System.out.println(car1);
		System.out.println(car2);
	//	isFaster(car1, car2);
	//	isFaster(car2, car1);
		
	}
}
