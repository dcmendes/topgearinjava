package cars;

public class PurpleCar extends Car{

	public PurpleCar(String name, double acceleration, double tireGripLevel, double fuelConsumption) {
		super(name, acceleration, tireGripLevel, fuelConsumption);
	
		this.name = " Purple Car";
		this.topSpeed = 220;
		this.acceleration = 6.923;
		this.tireGripLevel = 0.4;
		this.fuelConsumption = 0.6;
	}

}
