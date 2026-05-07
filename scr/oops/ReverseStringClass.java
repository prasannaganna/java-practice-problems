package oops;

public class ReverseStringClass {
    //String name = "prasanna";                 // it take default acces modifiers
   // String result = "";
   public String reverseName(String name)
   {
       String result = ""; // local  variable
       for(int i = name.length()-1;i >= 0; i--)
   {
       result = result + name.charAt(i);
   }
     return  result;
    }
}
