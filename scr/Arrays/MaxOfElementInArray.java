package Arrays;
// find the maximum in the array
public class MaxOfElementInArray {
    static void main(String[] args) {
        int array[]={3,5,6,1,4};
        int max =array[0];
        for(int i =1;i<array.length;i++)
        {
            if(array[i]> max)
            {
                max=array[i];
            }
        }
        System.out.println("maximum number : " +max);
    }
}
