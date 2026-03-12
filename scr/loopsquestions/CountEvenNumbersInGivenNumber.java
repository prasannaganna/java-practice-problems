package loopsquestions;

import java.util.Scanner;

//no of even number in given number
public class CountEvenNumbersInGivenNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int count = 0;
         int lastdigit;
        while(n>0){
            lastdigit =n%10;
            n=n/10;
            if(lastdigit%2==0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
