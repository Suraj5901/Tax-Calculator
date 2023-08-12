package com.TaxCalculator11thAug2023;

import java.util.Scanner;

public class CalculatorSimulator  {
//	double empSal;
//	String empName;
//	boolean isIndian;
	
	
	public static boolean isIndian(String country) {
        return "India".equalsIgnoreCase(country);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        TaxCalculator taxCalculator = new TaxCalculator();

        try {
        	
        	System.out.println("Enter Your Name: ");
        	String empName = sc.nextLine();
        	
        	System.out.println("Enter Your Country Name: ");
        	String country = sc.nextLine();
        	boolean isCountryIndian = isIndian(country);

//            System.out.println(country + " is Indian: " + isCountryIndian);
            
            System.out.println("Enter Your Total Income: ");
            double empSal = sc.nextDouble();
        	
        	
            double taxAmount = taxCalculator.calculateTax(empName, isCountryIndian, empSal);
            System.out.println("Tax amount is: " + taxAmount);
            
        } 
        catch (CountryNotValidException e) {
            System.err.println("Country not valid: " + e.getMessage());
        } 
        catch (EmployeeNameInvalidException e) {
            System.err.println("Employee name not valid: " + e.getMessage());
        } 
        catch (TaxNotEligibleException e) {
            System.err.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }

}
