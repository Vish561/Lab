package taxcalculator;

import java.util.Scanner;

public class CalculatorSimulator {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter employee name : ");
        String empName = scanner.nextLine();

        System.out.print("Is employee an Indian citizen answer true or false : ");
        boolean isIndian = scanner.nextBoolean();

        System.out.print("Enter employee salary : ");
        double esal = scanner.nextDouble();

        scanner.close();

        try {
        	
            double taxAmount = TaxCalculator.calculateTax(empName, isIndian, esal);
            System.out.println("Tax amount is : " + taxAmount);
            
        } 
        catch (CountryNotValidException e) {
        	
            System.out.println("Please Enter Valid Country : " + e.getMessage());
        
        } 
        catch (EmployeeNameInvalidException e) {
        	
            System.out.println("Enter Valid Employee Name : " + e.getMessage());
        
        } 
        catch (TaxNotEligibleException e) {
        	
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());

        }
    }
}