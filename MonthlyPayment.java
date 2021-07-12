package JavaProgram;

import java.util.Scanner;

public class MonthlyPayment {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        double principal = s.nextDouble();
        double years = s.nextDouble();
        double rate = s.nextDouble();

        double r = rate / (12*100);   // monthly interest rate
        double n = 12 * years;          // number of months

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }

}