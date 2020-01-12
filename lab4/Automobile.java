package koochaiyaphum.nitisak.lab4;
public class Automobile {
	private int gasoline;
	private int speed;
	private int maxSpeed;
	private int acceleration;
	private String model;
	private Color color;
	static private int numberOfAutomobile;

	enum Color {
		RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET, WHITE, BLACK
	}

	public int getGAsoline() {
		return gasoline;
	}

	public Automobile(int gasoline, int speed, int maxSpeed, int acceleration, String model, Color color) {
		this.gasoline = gasoline;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
		this.model = model;
		this.color = color;
		numberOfAutomobile += 1;
	}

	public int getGasoline() {
		return gasoline;
	}

	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Color getColor() {
		return color;
	}

	public static int getNumberOfAutomobile() {
		return numberOfAutomobile;
	}

	public static void setNumberOfAutomobile(int numberOfAutomobile) {
		Automobile.numberOfAutomobile = numberOfAutomobile;
	}

	public int getGetGasoline() {
		return gasoline;
	}

	public void setGetGasoline(int getGasoline) {
		this.gasoline = getGasoline;
	}

	@Override
	public String toString() {
		return "Automobile [gasoline=" + gasoline + ", speed=" + speed + ", maxSpeed=" + maxSpeed + ", acceleration="
				+ acceleration + ", model=" + model + ", color=" + color + "]";
	}

	public Automobile() {
		this.gasoline  = 0;
		this.speed  = 0;
		this.maxSpeed  = 160;
		this.acceleration  = 0;
		this.model = "Automobile";
		this.color = Color.WHITE;
		numberOfAutomobile += 1;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
