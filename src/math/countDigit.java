package math;
public class countDigit {

    public static void main(String[] args) {
        int number = 89776;

        int count = countDigitFun(number);
        System.out.println(count);
    }

    static int countDigitFun(int number){
        int res = 0;
        while (number > 0) {
            number = number/10;
            res++;
        }

        return res;
    }
}