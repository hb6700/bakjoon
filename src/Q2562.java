import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] cnt = new int[9];
        int max = cnt[0];
        int loc = 0;

        for(int i=0 ; i<cnt.length ; i++){
            cnt[i] = scan.nextInt();
            if(cnt[i] > max){
                max = cnt[i];
                loc = i+1;
            }
        }
        System.out.println(max);
        System.out.println(loc);
    }
}
