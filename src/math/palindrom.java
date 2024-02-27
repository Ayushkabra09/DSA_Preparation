package math;
public class palindrom {
    public static void main(String[] args) {
        int x = 2002;

        boolean isPalindrom = isPalindrom(x);
        System.out.println(isPalindrom);
    }

    static boolean isPalindrom(int x) {

        int reverse_x = 0;
        int temp = 0;
        while (temp > 0) {
            int ld  = temp % 10;
            reverse_x = (reverse_x * 10) + (ld);
            temp = temp/10;
        }

        return (reverse_x == x);
    }
}
