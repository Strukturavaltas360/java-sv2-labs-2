package algorithmsdecision;

public class Prime {
    public boolean isPrime(int number) {
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}