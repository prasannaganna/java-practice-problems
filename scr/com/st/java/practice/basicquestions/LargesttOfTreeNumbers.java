package com.st.java.practice.basicquestions;
// largest of three numbers  by using if conditions  variable are decleare in the problem without taking inputs from user
public class LargesttOfTreeNumbers {
    static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 4;
        //step 1 whether to use nested if or else if
        // iam using the else if
        if(a>b&&b>c)
        {
            System.out.println("a is the largest one");
        } else if (b>c && b>a) {
            System.out.println(" b is the largest one");
        } else {
            System.out.println("c is largest one");
        }

    }
}

