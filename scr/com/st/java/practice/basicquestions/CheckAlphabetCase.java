package com.st.java.practice.basicquestions;
//Given a character ch, determine whether it is uppercase or lowercase using ascii values
public class CheckAlphabetCase {
    static void main(String[] args) {
        char ch ='a';
        if(ch>65&&ch<90){
            System.out.println(ch + "uppercase");
        }
        else{
            System.out.println(ch + " is lowercase");
        }
    }
}
