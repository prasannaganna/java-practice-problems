package loopsquestions;

import java.util.Scanner;

//Find fractorial of number
public class FactorialOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int product =1;
        for(int i=1 ;i<=n;i++)
        {
            product = product * i;
        }
        System.out.println(product);
        sc.close();
    }
}

