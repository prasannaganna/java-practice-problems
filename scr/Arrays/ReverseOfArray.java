package Arrays;
// reverse of the element
public class ReverseOfArray {
    static void main(String[] args) {
        int array[]= {1,2,3,4};
        int reverse[]=new int [array.length];
            int j = 0;

            for(int i = array.length - 1; i >= 0; i--) {
                reverse[j] = array[i];
                j++;
            }

            // print reverse array
            for(int i = 0; i < reverse.length; i++) {
                System.out.print(reverse[i] + " ");
            }

    }
}
