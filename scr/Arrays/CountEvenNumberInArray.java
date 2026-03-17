package Arrays;
// find te number of the elements in the array
public class CountEvenNumberInArray {
    static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8};
        int count =0;
        for (int i =0;i<array.length;i++){
            if(array[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
