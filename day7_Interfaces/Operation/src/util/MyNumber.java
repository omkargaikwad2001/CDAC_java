package util;

public class MyNumber implements BasicIntOperations, AdvanceIntOperations {

    @Override
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    @Override
    public double calFactorial(int n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    @Override
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }

    @Override
    public boolean isEven(int n) {
        return n % 2 == 0;
    }
}
