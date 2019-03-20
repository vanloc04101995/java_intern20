package Ex02_19_3_2019_JavaCore_OOP;

public class mediumCar extends Car {
	private Boolean powerSteering;

	public mediumCar() {
		super();
	}

	public mediumCar(int numberPlate, int yearOfManufacture, String brand, Boolean haveInsurance,Boolean powerSteering) {
		super(numberPlate,yearOfManufacture,brand,haveInsurance);
		this.powerSteering = powerSteering;
	}

	public Boolean getPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(Boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	
	public Boolean hasInsurance() {
        return  getHaveInsurance();
    }
	
	public String toString() {
        return super.toString() + "\n,Have power steering: " + this.powerSteering ;
    }
	

}
