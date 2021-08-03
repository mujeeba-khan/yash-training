package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class BanksApp {

	public static void main(String[] args) {
		
		Banks b[] = new Banks[3];
		b[0] = new SBI();
		System.out.println("Balance for SBI account holder is: "+b[0].getBalance());
		b[1] = new HDFC();
		System.out.println("Balance for HDFC account holder is: "+b[1].getBalance());
		b[2] = new Kotak();
		System.out.println("Balance for Kotak account holder is: "+b[2].getBalance());
		

	}

}
