package cars;

public class RedCar extends Car {
	
	public RedCar(String name, double acceleration, double tireGripLevel, double fuelConsumption) {
		super(name, acceleration, tireGripLevel, fuelConsumption );
		
		this.name = " Red Car";
		this.topSpeed = 245;
		this.acceleration = 5.902;
		this.tireGripLevel = 0.15;
		this.fuelConsumption = 0.8;
		
	}

}
