package Arrays;

public class CountFrequencyOfElement {
    static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8,2,3,3};
        int count =0;
        int num = 3;
        for (int i =0;i<array.length;i++){
            if(num==array[i]){
                count++;
            }
        }
        System.out.println(+num + " occured in the array : " +count + "times");
    }
}
