package Arrays;
//product of the digits in the array
public class ProductOfDigitsInArray {
    static void main(String[] args) {
        int[] array = {1,2,3,4};
        int produt =1;
        for (int i =0;i<array.length;i++){
             produt = produt *array[i];
        }
        System.out.println(produt);
    }
}
