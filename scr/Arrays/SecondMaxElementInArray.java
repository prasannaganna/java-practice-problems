package Arrays;

public class SecondMaxElementInArray {
    static void main(String[] args) {
        int array[]={3,5,6,1,4};
        int max =array[0];
        int max2 = array[0];
        for(int i =1;i<array.length;i++)
        {
            if(array[i]> max)
            {
                max2 = max;
                max=array[i];
            }
            else if(array[i] > max2&& array[i] != max) {
                max2 = array[i];
            }

        }
        System.out.println("first maximum number  is : " +max);
        System.out.println("secound maximum number  is : " +max2);
    }
}
