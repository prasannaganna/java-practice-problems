package oops;

public class PalindromNumber {
   // int number = 121;
   // int lastdigit;
    //int result = 0;
    public int palindromNumber(int number)
    {
        //int number = 121;
        int lastdigit;
        int result = 0;
        while (number>0)
        {
            lastdigit = number % 10;
            result = (result)*10+ lastdigit;
            number =number/10;
        }
        return  result;
    }
}
