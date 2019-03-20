package Ex02_19_3_2019_JavaCore_OOP;

import java.io.IOException;

public class packageInsurance {
	private int packageA; 
	private int packageB;
	private int packageC;
	public packageInsurance() {
		super();
	}
	
	public packageInsurance(int a, int b, int c) {
		super();
		packageA = a;
		packageB = b;
		packageC = c;
	}

	public int getPackageA() {
		return packageA;
	}

	public void setPackageA(int packageA) {
		this.packageA = packageA;
	}

	public int getPackageB() {
		return packageB;
	}

	public void setPackageB(int packageB) {
		this.packageB = packageB;
	}

	public int getPackageC() {
		return packageC;
	}

	public void setPackageC(int packageC) {
		this.packageC = packageC;
	}
	
	public String numberOfPackage(){
		return this.packageA +","+  this.packageB +","+ this.packageC;
	}
	
	

	
	
	
}
