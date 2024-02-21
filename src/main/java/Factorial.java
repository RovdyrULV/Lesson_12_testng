public class Factorial {
    public static long getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorial(0));
        System.out.println(getFactorial(-24));
        System.out.println(getFactorial(16));
    }
}
