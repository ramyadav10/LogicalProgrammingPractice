package JavaProgram;

import java.util.Scanner;

public class Sqrt { 
    public static void main(String[] args) { 
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the value: ");
    	// read in the command-line argument
    	double c=s.nextInt();
        double epsilon = 1.0e-15; 
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }

}