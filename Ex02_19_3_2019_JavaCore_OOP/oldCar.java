package Ex02_19_3_2019_JavaCore_OOP;

public class oldCar extends Car{
	private int actionDuration;
	public oldCar() {
		super();
	}

	public oldCar(int numberPlate, int yearOfManufacture, String brand, Boolean haveInsurance,int actionDuration) {
		super(numberPlate,yearOfManufacture, brand, haveInsurance);
		this.actionDuration = actionDuration;
	}

	public int getActionDuration() {
		return actionDuration;
	}

//	public void nhap() {
//        super.nhap();
//        System.out.print("Enter action duration: ");
//       actionDuration = scanner.nextInt();
// }
	public void setActionDuration(int actionDuration) {
		this.actionDuration = actionDuration;
	}
	
	public String toString() {
        return super.toString() + "\n, Action duration: " + this.actionDuration ;
    }
}
