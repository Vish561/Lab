package lab4;

public class StingBuffer1 {

	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("This is a String Buffer");
		System.out.println(buffer1);
		System.out.println("-----------------------------------");
		
		buffer1.append(" This is a Sample Program");//Adds the String
		System.out.println(buffer1);
		System.out.println("---------------------------------------");
		
		buffer1.insert(21, "Object");//Insert String
		System.out.println("After inserting a String :\n"+buffer1);
		System.out.println("-----------------------------------");
		
		buffer1.reverse();
		System.out.println("After reversing a String :\n"+buffer1);
		System.out.println("-----------------------------------");
		
	    StringBuffer buffer2=new StringBuffer("This is a String Buffer");
		buffer2.replace(17, 24, "Builder");
		System.out.println("After replacing Buffer with Builder :\n"+buffer2);

	}

}
