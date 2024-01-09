import java.util.Arrays;
import java.util.Scanner;

public class Q10818{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] num = new int[N];
        for(int i=0 ; i<num.length ; i++){
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        System.out.print(num[0] + " " + num[N-1]);
    }
}

