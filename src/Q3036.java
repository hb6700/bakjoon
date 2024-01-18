import java.util.Scanner;

public class Q3036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] ring = new int[cnt];
        for (int i=0 ; i<cnt ; i++) {
            ring[i] = scan.nextInt();
        }

        int first = ring[0];

        for (int i=1 ; i<cnt ; i++){
            int gcd = findGCD(first, ring[i]);
            System.out.println((first/gcd) + "/" + (ring[i]/gcd));
        }
    }

    //최대 공약수(GCD)를 구하는 메서드
    private static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
