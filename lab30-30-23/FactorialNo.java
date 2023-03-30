package basics;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Factorial for number from 1 to 10");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+ " Factorial " + factorial(i));
		}

	}
	
	static int factorial(int n)
	 {
	  int res = 1, i;
	  for (i=2; i<=n; i++)
	   res *= i;
	  return res;
	 }

}
