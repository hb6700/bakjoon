import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2851_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int[] primes = findPrimes(M, N);
        int sum = calculateSum(primes);
        int minPrime = findMin(primes);

        System.out.println(sum == 0 ? -1 : sum);
        System.out.print(minPrime == Integer.MAX_VALUE ? "" : minPrime);
    }

    // M 이상 N 이하의 소수를 찾아 배열에 저장하는 메서드
    private static int[] findPrimes(int M, int N) {
        boolean[] isPrime = new boolean[N + 1];
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }

        return primes;
    }

    // 소수들의 합을 계산하는 메서드
    private static int calculateSum(int[] primes) {
        int sum = 0;
        for (int prime : primes) {
            sum += prime;
        }
        return sum;
    }

    // 최솟값을 찾는 메서드
    private static int findMin(int[] primes) {
        int min = Integer.MAX_VALUE;
        for (int prime : primes) {
            if (min > prime) {
                min = prime;
            }
        }
        return min;
    }
}
