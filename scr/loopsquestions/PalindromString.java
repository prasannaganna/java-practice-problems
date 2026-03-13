package loopsquestions;
//check the string is palindrom
public class PalindromString {
    static void main(String[] args) {
        String s ="tat";
        String orginal=s;
        String reverse ="";
        for( int i=s.length()-1;i>=0;i--){
            reverse = reverse+s.charAt(i);
        }
        if(orginal.equals(reverse))
        {
            System.out.println("palindrom");
        }
        else {
            System.out.println("not palindrom");
        }
    }

}
