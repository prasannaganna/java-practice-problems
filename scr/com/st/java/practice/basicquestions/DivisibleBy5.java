package com.st.java.practice.basicquestions;

public class DivisibleBy5 {
    static void main(String[] args) {
        int n =267;
        int lastdigit =n%5;
        if(lastdigit==0||lastdigit==5){
            System.out.println("divisible by 5");

        }
        else{
            System.out.println("not divisible by 5");
        }
    }
}
