package src;
public class Prime1to100 {
    public static void main(String[] args) {

            int n, i;

            for (n = 2; n <= 100; n++) { // Start from 2, as 1 is not prime
                int temp = 0;

                for (i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        temp = temp + 1;
                        break; // Optimization: exit loop early if not prime
                    }
                }

                if (temp == 0) {
                    System.out.println(n); // Print only if it's prime
                }
            }
        }
    }

