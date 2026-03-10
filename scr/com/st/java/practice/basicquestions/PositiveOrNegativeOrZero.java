package com.st.java.practice.basicquestions;
//Given an integer n, determine whether the number is positive, negative, or zero.
public class PositiveOrNegativeOrZero {
    static void main(String[] args) {
         int  number = 1;
         if(number>=0){
             if(number==0){
                 System.out.println("number is zero");
             }
             else {
                 System.out.println("number is positive");
             }
         }
         else {
             System.out.println("number is negative");
         }
    }
}
