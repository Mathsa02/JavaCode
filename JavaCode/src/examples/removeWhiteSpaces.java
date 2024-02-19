package examples;

import java.util.Scanner;

public class removeWhiteSpaces {    
	    public static void main(String[] args) {    
	       
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String str1 = scanner.nextLine();
	        scanner.close();
	       
	        str1 = str1.replaceAll("\\s+", "");    
	            
	        System.out.println("String after removing all the white spaces : " + str1);    
	    }    
	}
