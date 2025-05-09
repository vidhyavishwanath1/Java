class Multiple5 extends Thread {
    public void run() {
        int num = 5;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("Thread 1 - Table5: %d x %d = %d\n", num, i, num * i);
        }
    }
}

class PrimeN extends Thread {
    public void run() {
        int count = 0, num = 2;

        while (count < 5) {
            if (isPrime(num)) {
                System.out.printf("Thread 2 - Prime: %d\n", num);
                count++;
            }
            num++;
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return false;
        }
        return true;

    }
}

public class TreadClassExp_cd11 {
    public static void main(String[] args) {
        Multiple5 m5 = new Multiple5();
        PrimeN pn = new PrimeN();
        pn.start();
        m5.start();
    }
}
