package com.st.java.practice.basicquestions;

public class DivisibleBy3 {
    static void main(String[] args) {
        int n = 13;
        int sum =0;
        int lastdigit =n%10;
        int firstdigit =n/10;
        sum = lastdigit+firstdigit;
        System.out.println(sum);
        if (sum%3==0)
        {
            System.out.println("number divisible by the 3");
        }
        else
        {
            System.out.println("not divisible by the 3");
        }
    }
}
