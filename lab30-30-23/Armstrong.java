package basics;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=1000;i++) {
			arms(i);
		}
        
	}
	
	static void arms(int n){
		int arm=0,rem,c;
		c = n;
        while(n>0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n=n/10;
        }
        if(arm==c){
            System.out.println(c);
        }
	}

}
