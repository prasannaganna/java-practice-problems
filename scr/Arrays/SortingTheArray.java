package Arrays;

public class SortingTheArray {
    public static void main() {
        int[] arr = {21,2,5,1,8};
        for(int i = 0;i<arr.length;i++){
            boolean swap = false ;
            for (int j = 0 ; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            if(!swap){
                break;
            }
        }


        for(int i =0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
