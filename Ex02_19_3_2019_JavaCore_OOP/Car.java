package Ex02_19_3_2019_JavaCore_OOP;
import java.util.Scanner;

public class Car{
	private int numberPlate;
	private int yearOfManufacture;
	private String brand;
	private Boolean haveInsurance;
	Scanner scanner = new Scanner(System.in);
	
	public Car() {
		super();
	}

	
	public Car(int numberPlate, int yearOfManufacture, String brand, Boolean haveInsurance) {
		super();
		this.numberPlate = numberPlate;
		this.yearOfManufacture = yearOfManufacture;
		this.brand = brand;
		this.haveInsurance = haveInsurance;
	}

	public int getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(int numberPlate) {
		this.numberPlate = numberPlate;
	}
	
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Boolean getHaveInsurance() {
		return haveInsurance;
	}
	public void setHaveInsurance(Boolean haveInsurance) {
		this.haveInsurance = haveInsurance;
	}
	
//	public void nhap() {
//        System.out.print("Enter number plate : ");
//        numberPlate = scanner.nextInt();
//        System.out.print("Enter year of manufacture: ");
//        yearOfManufacture = scanner.nextInt();
//        System.out.print("Enter brand: ");
//        brand = scanner.nextLine();
//        System.out.print("Have Insureance: ");
//        haveInsurance = true;
//    }
	 public String toString() {
	        return "Number plate: " + this.numberPlate + ", Year of manufacture: " + this.yearOfManufacture + 
	            ", Brand: " + this.brand + ", Have insureance: " + this.haveInsurance ;
	  
	 }
//	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.setBrand("Ford");	
//		System.out.println(car1.getBrand());
//	}
}
	

