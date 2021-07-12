package JavaProgram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String args[])    
	{  
		long n, sum=0;  
		Scanner s=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=s.nextLong();  
		int i=1;  
	
		while(i <= n/2)//executes until the condition becomes false    
		{  
			if(n % i == 0)  
			{  
				//calculates the sum of factors  
				sum = sum + i; 
				System.out.print(sum+" ");
			}
		i++;  
		}
		//compares sum with the number  
		if(sum==n)  
		{  
			System.out.println(n+" is a perfect number.");  
		}
		else {  
			System.out.println(n+" is not a perfect number.");   
		}  
	}
}	