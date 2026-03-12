package loopsquestions;
//Print odd numbers between 1 and n
public class OddFrom1ToN {
    static void main(String[] args) {
        int n =10;
        for(int i=0;i<=n;i++) {
            if (i % 2 != 0) {
               // System.out.println("odd numbersare : " +i);
                System.out.println(i);
            }
        }
    }
}
