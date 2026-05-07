package loopsquestions;

public class ReverseString {
    static void main(String[] args) {
        String name = "prasanna";
       String result= "";
        for(int i = name.length()-1;i >= 0; i--)
        {
            result = result + name.charAt(i);
           // System.out.println(name.charAt(i));
        }
       System.out.println(result);
    }
}
