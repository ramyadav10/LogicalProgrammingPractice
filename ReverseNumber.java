package JavaProgram;

import java.util.Scanner;

public class ReverseNumber {
	static int n,reverse=0,remainder;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=s.nextInt();  
		while(n != 0) {
			 remainder= n%10;
			 reverse=((reverse*10)+remainder);
			 n=n/10;
		}
		System.out.println(reverse);	
	}
}
