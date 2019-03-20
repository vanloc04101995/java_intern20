package Ex02_19_3_2019_JavaCore_OOP;
import java.util.Random; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class showCarInfo extends packageInsurance{
	 
	public static void main(String[] args) throws IOException {	
		Random rand = new Random();
		int a = rand.nextInt(4);
		int b = rand.nextInt(4);
		int c = 10 - a -b;
		packageInsurance packIn = new packageInsurance(a,b,c);
		// create list of car 
		String[] carList = {"Toyota", "BWM", "HuynDai"};
		// enter number of car
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the number of cars: ");
	    int numberCar = scanner.nextInt();
	    Car[] newCar = new Car[numberCar];
	    
	    // Create Car
	    for(int i = 0; i< numberCar;i++) {
	    	// select random type car
	    	java.util.Random random = new java.util.Random();
	    	int randomCar = random.nextInt(carList.length);
	    	
	    	// Create random number plate and year
	    	
			int numberplate = rand.nextInt(89999);
			numberplate+=10000;
			int year = rand.nextInt(29);
			year+=1990;
			
			// Create car
			if (year>=2005) {
				newCar[i] = new modernCar(numberplate,year,carList[randomCar],Math.random() < 0.5,Math.random() < 0.5);	
			
			}
			else if(year>=1996) {
				newCar[i] = new mediumCar(numberplate,year,carList[randomCar],Math.random() < 0.5,Math.random() < 0.5);		
			}
			else {
				newCar[i] = new oldCar(numberplate,year,carList[randomCar],Math.random() < 0.5,20);
			}
			
	    }
	    // Show car's information in file
	    FileWriter myWriter = new FileWriter("E:\\JAVA_INTERN\\file\\cars.txt");
	    for (int i = 0; i < numberCar; i++) {
            System.out.println(newCar[i].toString()+"\n"); 
            myWriter.write(i+1+".");
            myWriter.write(newCar[i].toString());
            myWriter.write("\r\n");
//            System.out.println("Successfully wrote to the file.");  
	    }
//	    myWriter.close();
	    
	    // Insurance check
	    Scanner scanner1 = new Scanner(System.in);
	    System.out.print("Enter a car you want to buy: ");
	    int selectCar = scanner1.nextInt();
	    System.out.println(newCar[selectCar-1].toString());
	    Scanner scanner2 = new Scanner(System.in);
	    System.out.print("Enter a package you want to buy: 1.A 2.B 3.C ");
	    int selectPackage = scanner2.nextInt();
//	    if(selectPackage == 1) {
//	    	if (newCar[selectCar-1].getYearOfManufacture()<2005) {
//	    		System.out.println("Invalid Package");
//	    	}
//	    	else if(newCar[selectCar-1].getHaveInsurance()) {
//	    		System.out.println("Unavailable Buying!");
//	    	}
//	    	else {
//	    		System.out.println("Successful Buying");
//	    		
//	    		System.out.println(newCar[selectCar-1].toString());
//	    		if(a > 0) {
//	    			packIn.setPackageA(a-1);
//	    			newCar[selectCar-1].setHaveInsurance(true);
//	    		}else {
//	    			System.out.println("out of insurance");
//	    		}
//	    	}
//	    }
//	    else if (selectPackage == 2) {
//	    	if (1996 >newCar[selectCar-1].getYearOfManufacture() && newCar[selectCar-1].getYearOfManufacture()>2004) {
//	    		System.out.println("Invalid Package");
//	    	}
//	    	else if(newCar[selectCar-1].getHaveInsurance()) {
//	    		System.out.println("Unavailable Buying!");
//	    	}
//	    	else {
//	    		System.out.println("Successful Buying");
//	    		
//	    		System.out.println(newCar[selectCar-1].toString());
//	    		if(b>0) {
//	    			packIn.setPackageB(b-1);
//	    			newCar[selectCar-1].setHaveInsurance(true);
//	    		}else {
//	    			System.out.println("out of insurance");
//	    		}
//	    	}
//	    }
//	    else {
//	    	if (newCar[selectCar-1].getYearOfManufacture()>1995) {
//	    		System.out.println("Invalid Package");
//	    		
//	    	}
//	    	else if(newCar[selectCar-1].getHaveInsurance()) {
//	    		System.out.println("Unavailable Buying!");
//	    	}
//	    	else {
//	    		System.out.println("Successful Buying");
//	    		
//	    		System.out.println(newCar[selectCar-1].toString());
//	    		if(c>0) {
//	    			packIn.setPackageC(c-1);
//	    			newCar[selectCar-1].setHaveInsurance(true);
//	    		}else {
//	    			System.out.println("out of insurance");
//	    		}
//	    	}
//	    }
	    
	    if (newCar[selectCar-1].getYearOfManufacture()>=2005) {
	    	if (selectPackage == 1) {
	    		if(!newCar[selectCar-1].getHaveInsurance()) {
	    			System.out.println("Successful Buying");
	    			if(a > 0) {
		    			packIn.setPackageA(a-1);
		    			newCar[selectCar-1].setHaveInsurance(true);
		    		}else {
		    			System.out.println("out of insurance");
		    		}
	    		}else {
	    			System.out.println("Unavailable Buying!");
	    		}
	    	}else {
	    		System.out.println("Invalid Package");
	    	}
	    }
	    if(1996 <=newCar[selectCar-1].getYearOfManufacture() && newCar[selectCar-1].getYearOfManufacture()<=2004) {
	    	if (selectPackage == 2) {
	    		if(!newCar[selectCar-1].getHaveInsurance()) {
	    			System.out.println("Successful Buying");
	    			if(b>0) {
		    			packIn.setPackageB(b-1);
		    			newCar[selectCar-1].setHaveInsurance(true);
		    		}else {
		    			System.out.println("out of insurance");
		    		}
	    		}else {
	    			System.out.println("Unavailable Buying!");
	    		}
	    	}else {
	    		System.out.println("Invalid Package");
	    	}
	    }
	    if(newCar[selectCar-1].getYearOfManufacture()<=1995) {
	    	if (selectPackage == 3) {
	    		if(!newCar[selectCar-1].getHaveInsurance()) {
	    			System.out.println("Successful Buying");
	    			if(c>0) {
		    			packIn.setPackageC(c-1);
		    			newCar[selectCar-1].setHaveInsurance(true);
		    		}else {
		    			System.out.println("out of insurance");
		    		}
	    		}else {
	    			System.out.println("Unavailable Buying!");
	    		}
	    	}else {
	    		System.out.println("Invalid Package");
	    	}
	    }
	   System.out.println(packIn.numberOfPackage());
//	   myWriter.write(packIn.numberOfPackage());
	   myWriter.close();
	}
}

