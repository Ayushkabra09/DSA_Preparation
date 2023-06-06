public class ProductofDigits {

    public static void main(String[] args) {
        int num = 123;
        System.out.println(productDigit(num));
    }

    static int productDigit(int num){
        if (num % 10 == num){
            return num;
        }

        return (num%10) * productDigit(num/10);
    }

}
