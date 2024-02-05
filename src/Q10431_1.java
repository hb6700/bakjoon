import java.util.Scanner;

public class Q10431_1 {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int N =
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i=0 ; i<N ; i++){
            int count = 0;
            int[] num = new int[20];

            for(int j=0 ; j<20 ; j++){
                for(int k=0; k<j ; j++){
                    if (num[k] > num[j]){
                        count++;
                    }
                }
            }
            System.out.println(i + " " + count);
        }
        scan.close();
    }
}
