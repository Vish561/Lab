package basics;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<1000;i++) {
			checkNumber(i);
		}

	}
    static int fact(int number)   
    {   
        int f = 1;   
        while (number != 0) {   
            f = f * number;   
            number--;   
        }   
        return f;   
    }   
  
   
    static void checkNumber(int number)   
    {   
        int sum = 0;     
          
        int tempNumber = number;      
          
        
        while (tempNumber != 0) {   
            
            sum = sum + fact(tempNumber % 10);   
  
            
            tempNumber = tempNumber / 10;   
        }   
  
        if(sum == number)  
            System.out.println(number + " is a Strong number");   
    }  

}
