package com.st.java.practice.basicquestions;
//check given year is  leap year or not  if not which year
public class LeapYearOrNot {
    static void main(String[] args) {
        int n = 2012;
        if ((n%4==0 && n%100!=0)||n%400==0) {
            if (n % 400 == 0) {
                System.out.println("its leap year");
            } else {
                System.out.println(" its leap year");
            }
        } else {
            System.out.println("its not a leap year");
        }
    }

}
