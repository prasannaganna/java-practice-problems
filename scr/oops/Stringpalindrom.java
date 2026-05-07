package oops;

public class Stringpalindrom {
    //String name = "tat";
   // String reverse = "";
    public String PalindromString(String name){
        String reverse = "";
        for (int i = name.length()-1;i>=0;i--){
            reverse = reverse + name.charAt(i);
        }
        return  reverse;

    }
}
