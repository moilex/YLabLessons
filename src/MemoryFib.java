import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MemoryFib {
    public static void main(String[] args) {
        System.out.println(cacheFib(75));
    }
    public static Map<Long, BigInteger> memory = new HashMap<>();

    public static BigInteger cacheFib(long n){
        if(n == 0){
            return BigInteger.ZERO;
        }
        if(n == 1){
            return BigInteger.ONE;
        }
        if(memory.containsKey(n)){
            return memory.get(n);
        }

        BigInteger a = cacheFib(n - 2).add(cacheFib(n - 1));
        memory.put(n,a);
        return a;
    }
}
