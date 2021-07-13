package JavaProgram;

import java.util.Scanner;

public class ToBinary {
	    // Function converting decimal to binary
	    static int num;
		static void decimalToBinary(int num)
	    {
	        // Function to print integer to binary using
	        // inbuilt toBinaryString method
	        System.out.println(Integer.toBinaryString(num));
	    }
	 
	    // Main driver function
	    public static void main(String[] args)
	    {
	    	Scanner s=new Scanner(System.in);
			System.out.print("Enter the Number:");
			num =s.nextInt(); // Number to be converted into binary
	 
	        // Calling function
	        decimalToBinary(num);
	    }
	}

