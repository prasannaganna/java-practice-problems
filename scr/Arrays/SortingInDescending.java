package Arrays;
// sorting the array in the descending order
public class SortingInDescending {
    static void main(String[] args) {
        int array[]={2,5,3,6,9,8};
        int  temp;
        for(int i =0; i< array.length;i++){
            for(int j=0;j< array.length-1
                    ;j++){
                if (array[j]<array[j+1]){
                    temp =  array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i =0; i< array.length;i++) {
            System.out.println(array[i] + " ");
        }
    }
}
