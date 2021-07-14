package JavaProgram;

import java.util.Scanner;

import java.util.Scanner;
import java.lang.Integer;

public class SwapNibbles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int n = s.nextInt();
        DecimaltoBinary(n);
    }
    private static void DecimaltoBinary(int x){
        int t = x;
        int bin=0;
        int  temp=1, r;
        while (x!=0){
            r = x % 2;
            x = x / 2;
            bin = bin + r * temp;
            temp = temp * 10;
        }
        String str = 0+""+bin;
        int b = Integer.parseInt(str, 2);
        System.out.println("Binary of the "+t+" Number is : "+str);
        System.out.println(b);

        System.out.println("Chosse the following functions : ");
        System.out.println("1: Swap nibbles and find the new number : ");
        System.out.println("2: Find the resultant number is the number is a power of 2 : ");
        Scanner number = new Scanner(System.in);
        int cas = number.nextInt();
        switch (cas){
            case 1:
                System.out.println(((b & 0x0F) << 4 | (b & 0xF0) >> 4));
                break;
            case 2:
                int z = (int) ((b & 0x0F) << 4 | (b & 0xF0) >> 4);
                System.out.println(z);
                System.out.println(Math.pow(z, 2));
                break;
            default:

        }

    }

}