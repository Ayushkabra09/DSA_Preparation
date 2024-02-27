package math;
public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.err.println(factorialOfN(n));
    }

    static int factorialOfN(int n){

        if (n < 1) {
            return n;
        }
        int fact = n;
        while (n > 1) {
            n -= 1;
            fact *= n;
        }

        return fact;
    }
}
