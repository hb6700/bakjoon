import java.util.Arrays;
import java.util.Scanner;

public class Q2587 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hap = 0;
        int[] input = new int[5];

        for(int i=0 ; i<5 ; i++) {
            input[i] = scan.nextInt();
            hap += input[i];
        }
        Arrays.sort(input);

        System.out.println(hap/5);
        System.out.println(input[2]);
    }
}
