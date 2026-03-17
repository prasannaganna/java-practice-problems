package Arrays;
// find the smallest element in the array
public class SmallElementOfArray {
    static void main(String[] args) {
        int array[]={3,5,6,1,4};
        int minium =array[0];
        for(int i =1;i<array.length;i++)
        {
            if(array[i]< minium)
            {
                minium=array[i];
            }
        }
        System.out.println("its is the smallest element : " +minium);
    }
}
