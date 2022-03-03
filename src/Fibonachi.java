import java.math.BigInteger;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(fibCycle(8));
        System.out.println(fibBig(50));
    }

    public static long fib(long n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        } else{
        return fib(n - 1) + fib(n - 2);
        }
    }

    public static long fibCycle(long n){
        long a = 0;
        long b = 1;
        long num = 0;
        for(int i = 2; i <= n; i++){
            num = a + b;
            a = b;
            b = num;
        }
        return num;
    }

    public static BigInteger fibBig(long n){
        if(n == 0){
            return BigInteger.ZERO;
        }
        if(n == 1){
            return BigInteger.ONE;
        }
        return fibBig(n - 2).add(fibBig(n - 1));
    }
}
