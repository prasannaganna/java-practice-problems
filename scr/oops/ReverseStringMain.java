package oops;

public class ReverseStringMain {
    static void main(String[] args) {
        ReverseStringClass as= new ReverseStringClass();
        PalindromNumber pn = new PalindromNumber();
        Stringpalindrom sp = new Stringpalindrom();
        PrimeNumber pnp = new PrimeNumber();
        System.out.println(as.reverseName("gani"));
        System.out.println(as.reverseName("prasanna"));
        System.out.println(pn.palindromNumber(232));
        System.out.println(sp.PalindromString("tat"));
        System.out.println(pnp.PrimeNumberMethod());
    }

}
