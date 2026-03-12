package loopsquestions;

import java.util.Scanner;

//sum of the digits using the while loops
public class SumOfNumberByWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int sum = 0;
        int digit;
        while (n>0){
            digit = n%10;
            sum = sum + digit;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
