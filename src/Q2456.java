import java.util.Scanner;

public class Q2456 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[4][4];    //[1][1~3],[2][1~3],[3][1~3]
        int count = scan.nextInt();

        for(int i=0 ; i<count ; i++){   //입력받은 값의 크기에 맞는 배열에 값을 더함
            arr[1][scan.nextInt()]++;
            arr[2][scan.nextInt()]++;
            arr[3][scan.nextInt()]++;
        }

        int max = 0;        //총점
        int num = 0;        //후보
        int check = 0;      //동점자
        
        for(int i=1 ; i<=3 ; i++){
            int sum = arr[i][1] + 2*arr[i][2] + 3*arr[i][3];
            if(sum > max){
                max = sum;
                num = i;
                check = 0;
            } else if (sum == max) {
                if(arr[num][3] < arr[i][3]){
                    num = i;
                    check = 0;
                } else if (arr[num][3] == arr[i][3] && arr[num][2] < arr[i][2]) {
                    num = i;
                    check = 0;
                } else if (arr[num][3] == arr[i][3] && arr[num][2] == arr[i][2]) {
                    check = 1;
                }
            }
        }

        if(check == 0){
            System.out.println(num + " " + max);
        }else{
            num = 0;
            System.out.println(num + " " + max);
        }
    }
}