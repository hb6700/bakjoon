import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int[][][] dp = new int[n][m][3];

        int max = 999999;

        //값 입력후 배열 채우기
        for (int i=0 ; i<n ; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0 ; j<m ; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //출발하는곳 초기화
        for (int i=0 ; i<m ; i++){
            dp[0][i][0] = map[0][i];        //왼쪽 대각선
            dp[0][i][1] = map[0][i];        //가운데
            dp[0][i][2] = map[0][i];        //오른쪽 대각선
        }

        for (int i=1 ; i<n ; i++){
            //올 수 없는 곳에 대해서 max값으로 초기화
            dp[i][0][0] = max;
            dp[i][m-1][2] = max;

            for (int j=0 ; j<m ; j++){
                if(!(j-1 < 0 || j-1 >= m) && (j+1 < 0 || j+1 >= m)){                //오른쪽에서 못오는 경우
                    dp[i][j][0] = Math.min(dp[i-1][j-1][1], dp[i-1][j-1][2]) + map[i][j];
                    dp[i][j][1] = Math.min(dp[i-1][j][0], dp[i-1][j][2]) + map[i][j];
                } else if (!(j-1 < 0 || j-1 >= m) && !(j+1 < 0 || j+1 >= m)) {      //양쪽에서 올 수 있는 경우
                    dp[i][j][0] = Math.min(dp[i-1][j-1][1], dp[i-1][j-1][2]) + map[i][j];
                    dp[i][j][1] = Math.min(dp[i-1][j][0], dp[i-1][j][2]) + map[i][j];
                    dp[i][j][2] = Math.min(dp[i-1][j+1][0], dp[i-1][j+1][1]) + map[i][j];
                } else if ((j-1 < 0 || j-1 >= m) && !(j+1 < 0 || j+1 >= m)) {       //왼쪽에서 못오는 경우
                    dp[i][j][1] = Math.min(dp[i-1][j][0], dp[i-1][j][2]) + map[i][j];
                    dp[i][j][2] = Math.min(dp[i-1][j+1][0], dp[i-1][j+1][1]) + map[i][j];
                }
            }


        }
        int min = max;

        //마지막 행에서 최소값 찾기
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<3 ; j++){
                min = Math.min(min,dp[n-1][i][j]);
            }
        }
        System.out.println(min);
    }
}
