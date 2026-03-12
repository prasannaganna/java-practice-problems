package loopsquestions;

import java.util.Scanner;

//Print numbers from 1 to n using for loop
public class PrintAllNumbersUsingForLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        for(int i =0; i<=n;i++){
            System.out.println(i);
        }
    }
}
