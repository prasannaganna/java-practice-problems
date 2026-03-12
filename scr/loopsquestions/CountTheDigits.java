package loopsquestions;

import java.util.Scanner;

// count the digits in the number
public class CountTheDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int count =0;
        int lastdigit;
        while(n>0){
            lastdigit =n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
