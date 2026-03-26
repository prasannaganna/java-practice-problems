package Arrays;

import static java.util.Collections.swap;
// sorting the elements with the bobble sorting in ascending order
public class SortingArray {
    static void main(String[] args) {
         int array[]={ 60,2,5,3,6,9,8,30};
         int  temp;
         for(int i =0; i< array.length;i++){
             for(int j=0;j< array.length-1;j++){
                 if (array[j]>array[j+1]){
                      temp =  array[j];
                      array[j]=array[j+1];
                      array[j+1]=temp;
                 }
             }
         }
         System.out.print("array[");
        for(int i =0; i< array.length;i++) {
            System.out.print(+array[i] + " ");
        }
        System.out.print("]");

    }
}
