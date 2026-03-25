package loopsquestions;

import java.util.Scanner;

public class TableOfNumberUsingfor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int n = sc.nextInt();
        int result;
        for(int i=1;i<=10;i++)
        {
            result = n*i;
            System.out.println(n + "*" + i  + "=" + result);
        }
    }
}
