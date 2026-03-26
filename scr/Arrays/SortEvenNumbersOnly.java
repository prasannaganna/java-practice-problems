package Arrays;
// sort even numbers only0
public class SortEvenNumbersOnly {
    static void main(String[] args) {
        int array[]={5, 2, 8, 7, 3, 6};
        for(int i =0;i<array.length;i++){
           for(int j =0;j< array.length-1;j++){
                if(array[j]%2==0&&array[j+1]%2==0){
                    if (array[j]>array[j+1]){
                         int temp = array[j];
                         array[j]=array[j+1];
                         array[j+1] =temp;
                    }
                }
           }
        }
        for(int i=0;i< array.length;i++){
            System.out.println(array[i] + " ");
        }
    }
}
