package cars;

public abstract class Car {

	protected String name;
	protected double topSpeed;
	protected double acceleration;
	protected double tireGripLevel;
	protected double fuelConsumption;
	
	public Car(String name, double acceleration, double tireGripLevel, double fuelConsumption) {
		
		this.name = name;
		this.topSpeed = topSpeed;
		this.acceleration = acceleration;
		this.tireGripLevel = tireGripLevel;
		this.fuelConsumption = fuelConsumption;
	}
	
	public Car() {
		this.name = name;
		this.topSpeed = topSpeed;
		this.acceleration = acceleration;
		this.tireGripLevel = tireGripLevel;
		this.fuelConsumption = fuelConsumption;
	}
	
	public void Accelerate() {
		
	}
	
	public void Brake() {
		
	}
	
	public void ChooseDirection() {
		
	}
	
}
