package Arrays;

import static java.util.Collections.swap;

public class SortingArray {
    static void main(String[] args) {
         int array[]={2,5,3,6,9,8};
         int  temp;
         for(int i =0; i< array.length-1;i++){
             for(int j=0;j< array.length-1;j++){
                 if (array[i]>array[i+1]){
                      temp =  array[i];
                      array[i]=array[i+1];
                      array[i+1]=temp;
                 }
             }
         }
        for(int i =0; i< array.length;i++) {
            System.out.println(array[i] + " ");
        }
    }
}
