package loopsquestions;

import java.util.Scanner;

// product of the digit
public class ProductOfDigitsInNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int product =1;
        int lastdigit;
        for(int i=1;i<=n;i++){
            lastdigit = n%10;
            product = product*lastdigit;
            n=n/10;

        }
        System.out.println(product);
        sc.close();
    }
}
