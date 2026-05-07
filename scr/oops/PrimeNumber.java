package oops;

public class PrimeNumber {
    int number = 12;
    int count = 0;
    public int   PrimeNumberMethod(){
        for(int i =1; i<=number; i++){
           if(number %i==0){
               count++;
           }
           if(count==2){
              // System.out.println("its prime number");
              // return  number ;
           }
        }
        return  number;
    }
}
