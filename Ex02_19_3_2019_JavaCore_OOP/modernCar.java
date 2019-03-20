package Ex02_19_3_2019_JavaCore_OOP;

public class modernCar extends Car{
	private Boolean havePositioningDevice;
	public modernCar() {
		super();
	}
	
	public modernCar(int numberPlate, int yearOfManufacture, String brand, Boolean haveInsurance, Boolean havePositioningDevice) {
		
		super(numberPlate,yearOfManufacture, brand, haveInsurance );
		this.havePositioningDevice = havePositioningDevice;
	}
	     
	public Boolean getHavePositioningDevice() {
		return havePositioningDevice;
	}
	public void setHavePositioningDevice(Boolean havePositioningDevice) {
		this.havePositioningDevice = havePositioningDevice;
	}
	
	public String toString() {
        return super.toString() + "\n,Have positioning: " + this.havePositioningDevice ;
    }
	
}
