package com.st.java.practice.basicquestions;
//
//Given an integer n, check:
// required out put
//If divisible by 3 and 5 → print "FizzBuzz"
//
//If divisible by 3 only → print "Fizz"
//
//If divisible by 5 only → print "Buzz"
//
//Otherwise print "Not divisible"
public class DivisibleBy3And5 {
    static void main(String[] args) {
        int n = 21;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0)
        {
            System.out.println("Buzz");
        } else {
            System.out.println("Not divisible");
        }
    }
}
