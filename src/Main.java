//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // isPrime(3);
        //System.out.println(reverseNumber(234));


    }
//1) Verilmiş n ədədinin faktorialını hesablayan metod yaz.

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //2) İlk n Fibonacci ədədini qaytaran metod yaz


    static void printFibonacci(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    //3) Verilmiş ədədin sadə (prime) olub-olmadığını yoxlayan metod yaz.
    static void isPrime(int input) {
        if (input % 2 == 0 && input % 3 == 0) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is prime");
        }
    }


    //4) Verilmiş sözün palindrom olub-olmadığını yoxla


    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return s.equals(rev);




    }

    //5) Verilmiş ədədin rəqəmlərini toplayan metod yaz.

    static int getSum ( int n){

        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    //6) base ədədini exponent dərəcəsinə yüksəldən öz metodunu yaz (Math.pow istifadə etmədən)

    public static int ownPow(int baseNum, int power) {
        if(power == 0){
            return 1;
        }else{
            return baseNum * ownPow(baseNum, power-1);
        }
    }


    //7) Verilmiş ədədi tərsinə çevirən metod yaz.
    public static long reverseNumber(long n) {
        long nəticə = 0;

        while (n > 0) {
            nəticə = nəticə * 10 + n % 10;
            n /= 10;
        }
        return  nəticə;
    }

    //8) Verilmiş ədədin neçə rəqəmdən ibarət olduğunu hesablayan metod yaz.
    public static int countDigits(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }

        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    //9) Verilmiş ədədin Armstrong ədədi olub-olmadığını yoxlayan metod yaz.

    public static int getDigitCount(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + getDigitCount(n / 10);
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digitCount = getDigitCount(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += power(digit, digitCount);
            number = number / 10;
        }

        return sum == originalNumber;
    }
}