package Arrays;

public class ExistElementInArray {
    static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8};
        int num=5;
        for (int i =0;i<array.length;i++)
        {
            if(num ==array[i])
            {
                System.out.println(+num  + " : the number exist in the array");
            }
        }
    }
}
