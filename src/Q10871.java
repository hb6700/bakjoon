import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int[] output = new int[N];
        int cnt = 0;

        for(int i=0 ; i<N ; i++){
            int num = scan.nextInt();
            if(num < X){
                output[cnt] = num;
                cnt++;
            }
        }

        for(int i=0 ; i<cnt ; i++){
            System.out.print(output[i] + " ");
        }
    }
}