package loopsquestions;

import java.util.Scanner;

//Given an integer n, check whether the number is a palindrome.
public class PalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int orginal =n;
        int reverse = 0;
        int lastdigit ;
        while(n>0){
            lastdigit =n%10;
            reverse =reverse*10+lastdigit;
            n=n/10;
        }
        if(orginal==reverse)
        {
            System.out.println("its a palimdrom");
        }
        else {
            System.out.println("not a polindrom");
        }
    }
}
