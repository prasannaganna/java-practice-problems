package Arrays;
// find the even numbers in tha array
public class EvenNumbersInArray {
    static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8};
        for (int i =0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.println("even numbers are : " +array[i]);
            }
        }
    }
}
