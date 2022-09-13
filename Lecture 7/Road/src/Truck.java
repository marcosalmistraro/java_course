
public class Truck extends Vehicle{

	private double maxPayload;
	
	public Truck(double topSpeed, double mass, double maxPayload) {
        super(topSpeed, mass);
        this.maxPayload = maxPayload;
	}	
	
	public double getMaxPayload(){
		return this.maxPayload;
	}
	
	public void setMaxPayload(double newMaxPayload){
		this.maxPayload = newMaxPayload;
	}
    
    @Override
    public double calculateValue(){
		return (1000*this.topSpeed/(this.mass*0.1))*(maxPayload/1000);
	}
}