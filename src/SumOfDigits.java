public class SumOfDigits {

    public static void main(String[] args) {
        int num = 12255;
        System.out.println(sumDigit(num));
    }

    static int sumDigit(int num){

        if(num == 0)
            return 0;

        return (num % 10) + sumDigit(num/10);

    }

}
