package com.bridgelabz.pincodevalidator;
import java.util.regex.*;  
public class PinCode {

	public static void validatePin(String pincode) {
		
		boolean result = Pattern.matches("^[0-9]{3}[ ][0-9]{3}$", pincode);
		if(result) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		
		validatePin("400   088");
		
	}
	
	
}
