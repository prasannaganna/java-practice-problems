package com.st.java.practice.basicquestions;

public class DivisibleBy3 {
    static void main(String[] args) {
        int n = 132;
        int sum =0;
        int lastdigit =n%10;
        int middlenumber =(n%10)/10;
        int firstdigit =n/10;
        sum = lastdigit+middlenumber+firstdigit;
        System.out.println(sum);


        int sum1 = 0;
        while(n>0){
            int div = n%10;
            sum1+=div;
            n=n/10;
        }

        System.out.println(sum1);
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
