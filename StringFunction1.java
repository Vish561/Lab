package lab4;

public class StringFunction1 {

	public static void main(String[] args) {
		String string1 = "Welcome to Java World";
		System.out.println("String : " + string1);
		System.out.println("=====================");
		
		char pos = string1.charAt(4);//return char at 5th Position
		System.out.println("Character at 5th position : " + pos );
		System.out.println("===============================");
		
		int comp = string1.compareToIgnoreCase("Welcome");//compare string1 with "Welcome" lexicographically
		System.out.println("Lexicographically Compared Strings are   : " + comp);	
		System.out.println("===============================================");
		
		String concat = string1.concat(" Let us learn");//Concatenate "let us learn"
		System.out.println(concat);
		System.out.println("====================");
		
		int pos2 = string1.indexOf('a');//return position of first occurrence of character 'a'
	  System.out.println("Position of first occurence of character 'a' is : " + pos2);
	    System.out.println("========================================================");
		
	    String newstring = string1.replaceAll("a", "e");//Replace all occurrences of 'a' character with new 'e'
	    System.out.println("Replaced string :" + newstring );
	    System.out.println("==============================="); 
	    
	    String substring = string1.substring(3, 11);//return string between 4th and 10th position
	    System.out.println("String between 4th and 10th position is : " + substring);
	    System.out.println("===============================");
	    
	    String lowerstr = string1.toLowerCase();//lower case of string
	    System.out.println("String in lowercase : " + lowerstr);

	}

}
