
public abstract class Vehicle {

	protected double topSpeed;
	protected double mass;
	
	public Vehicle(double topSpeed, double mass){
		this.setTopSpeed(topSpeed);
		this.setMass(mass);
	}	
	
	public double calculateValue(){
		return 1000*this.topSpeed/(this.mass*0.1);
	}
	
	public double getTopSpeed() {
		return topSpeed;
	}
	
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}

	@Override
	public String toString(){
		return "This vehicle has a top speed of " + getTopSpeed() + "\n"
		+ "and a mass of " + mass;
	}
}