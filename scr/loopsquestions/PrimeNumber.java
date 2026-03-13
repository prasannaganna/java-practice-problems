package loopsquestions;

import java.util.Scanner;

// prime number in natural numbers
public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0;
        int n1= sc.nextInt();
      //  int n2=sc.nextInt();
        int n = 0;
      //  for(int j = n1 ; n1<n2 ; n1++)
        //    n = j;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
                count++;
            }
                else if(count==2)
                {
                    System.out.println("prime number " +i);
                }
                else
                {
                    System.out.println("not  prime number");
                }
            System.out.println(count);
        }
    }
}
