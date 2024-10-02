package com;
import java.util.Scanner;
public class Soluction {
	
	
	    String s;
	    double d;
	    int i;
	    
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	       
	        
	        // Read inputs
	        String s = scan.nextLine();
	        double d = scan.nextDouble();
	        int i = scan.nextInt();
	        
	        // Consume the remaining newline character
	        scan.nextLine();
	        
	        // Print the inputs
	        System.out.println("String:xdvbfbgnv " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        
	        scan.close(); // Close the scanner to prevent resource leak
	    }
	}


