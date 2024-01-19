import java.util.Scanner;

public class Q30642 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String mascot = scan.nextLine();
        int K = scan.nextInt();
        int result = 0;

        if(N >= K){
            if(mascot.equals("annyong")){
                if(K%2 == 0){
                    result = K+1;
                } else {
                    result = K;
                }
            } else if (mascot.equals("induck")) {
                if(K%2 == 0){
                    result = K;
                } else {
                    result = K+1;
                }
            }
        }

        System.out.println(result);
        
        if(result > N){
            result = result - 2;
        }

       System.out.println(result);
    }
}
