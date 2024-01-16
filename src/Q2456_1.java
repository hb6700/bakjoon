import java.util.Scanner;

public class Q2456_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[][] arr = new int[3][count + 1];

        for (int i = 1; i <= count; i++) {
            arr[0][i] = scan.nextInt();
            arr[1][i] = scan.nextInt();
            arr[2][i] = scan.nextInt();
        }

        for (int i = 1; i <= count; i++) {
            arr[0][0] += arr[0][i];
            arr[1][0] += arr[1][i];
            arr[2][0] += arr[2][i];
        }

        //System.out.println(arr[0][0]);
        //System.out.println(arr[1][0]);
        //System.out.println(arr[2][0]);

        int max = 0;
        int num = 0;

        for (int i=0 ; i<3 ; i++) {
            System.out.println(max);
            System.out.println(arr[i][0]);
            System.out.println();
            if (arr[i][0] > max) {
                max = arr[i][0];
                num = i;
            } else if (arr[i][0] == max) {
                int nowScoreOne = 0;
                int nowScoreTwo = 0;
                int nowScoreThree = 0;
                for (int j=1 ; j<=count ; j++) {
                    if (arr[num][j] == 1) {
                        nowScoreOne++;
                    } else if (arr[num][j] == 2) {
                        nowScoreTwo++;
                    } else if (arr[num][j] == 3) {
                        nowScoreThree++;
                    }
                }

                int newScoreOne = 0;
                int newScoreTwo = 0;
                int newScoreThree = 0;
                for (int j=1; j<=count ; j++) {
                    if (arr[i][j] == 1) {
                        newScoreOne++;
                    } else if (arr[i][j] == 2) {
                        newScoreTwo++;
                    } else if (arr[i][j] == 3) {
                        newScoreThree++;
                    }
                }

                System.out.println(nowScoreThree + " " + newScoreThree);
                System.out.println(nowScoreTwo + " " + newScoreTwo);
                System.out.println(nowScoreOne + " " + newScoreOne);

                if (nowScoreThree < newScoreThree) {
                    max = arr[i][0];
                    num = i;
                } else if (nowScoreThree == newScoreThree && nowScoreTwo < newScoreTwo) {
                    max = arr[i][0];
                    num = i;
                } else if (nowScoreThree == newScoreThree && nowScoreTwo == newScoreTwo) {
                    num = 0;
                }
            }
        }
        num =+ 1;
        System.out.println(num + " " + max);
    }
}
