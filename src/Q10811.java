import java.util.Scanner;

public class Q10811 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        //바구니에 값을 넣음(1번 바구니 : arr[0] -> 1번)
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = i + 1;
        }

        //바구니 역순 만들기
        for (int i=0 ; i<M ; i++){
            int I = scan.nextInt();         //1
            int J = scan.nextInt();         //2

            for (int j=I ; j<=J ; j++){     //1~2
                int rev = J--;              //rev = 2 J = 1
                int temp = arr[j-1];          //temp = arr[1] = 1
                arr[j-1] = arr[rev-1];          //arr[1] = 2
                arr[rev-1] = temp;            //arr[2] = temp = 1
            }
        }

        //출력
        for (int i=0 ; i<N ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
