import java.util.Scanner;

//백준 11170
public class Q11170 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //몇 줄?
        int line = scan.nextInt();
        int[] count = new int[line];
        for(int n=0; n<line ; n++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            for (int i=N ; i<=M ; i++) {
                String numString = Integer.toString(i);
                for (int j=0 ; j<numString.length() ; j++) {
                    if (numString.charAt(j) == '0') {
                        count[n]++;
                    }
                }
            }
        }

        for(int n=0 ; n<line ; n++){
            System.out.println(count[n]);
        }
    }
}
