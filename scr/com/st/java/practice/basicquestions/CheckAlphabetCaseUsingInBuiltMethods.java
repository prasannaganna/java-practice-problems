package com.st.java.practice.basicquestions;
//CheckAlphabetCase  using in build methods
public class CheckAlphabetCaseUsingInBuiltMethods {
    static void main(String[] args) {
        char ch ='q';
        if(Character.isUpperCase(ch)){
            System.out.println(ch + " is uppercase");
        }
        else{
            System.out.println(ch + " is lowercase");
        }
    }
}
