package taxcalculator;

class TaxCalculator {
	
   public static double calculateTax(String empName, boolean isIndian, double esal)
            
		   throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        
	   if (!isIndian) {
		   
            throw new CountryNotValidException("Employee must be an Indian citizen for calculating tax");
        }
        if (empName == null || empName.isEmpty()) {
        	
            throw new EmployeeNameInvalidException("Employee name cannot be empty");
        }
        if (esal < 10000) {
        	
            throw new TaxNotEligibleException("No need to pay tax");
        }

        double taxAmount = 0;
        if (esal > 100000) {
        	
            taxAmount = esal * 8 / 100;
            
        } else if (esal >= 50000 && esal <= 100000) {
        	
            taxAmount = esal * 6 / 100;
            
        } else if (esal >= 30000 && esal < 50000) {
        	
            taxAmount = esal * 5 / 100;
            
        } else if (esal >= 10000 && esal < 30000) {
        	
            taxAmount = esal * 4 / 100;
            
        } else {
            throw new TaxNotEligibleException("no need to pay tax");
        }
        return taxAmount;
    }
}