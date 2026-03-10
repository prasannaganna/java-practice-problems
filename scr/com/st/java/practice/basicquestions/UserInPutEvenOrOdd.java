package com.st.java.practice.basicquestions;

import java.util.Scanner;

//Given an integer n from user input, determine whether the number is even or odd.
public class UserInPutEvenOrOdd {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println( "enter the number : "  );
        int n =sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n +":is even");
        }
        else
        {
            System.out.println(n + ": is odd");
        }

    }
}
