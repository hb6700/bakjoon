import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class W8Q1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long[][][][] dp = new long[N + 1][R + 1][G + 1][B + 1];
        for (int i = 0; i <= N; i++) {
            for (int r = 0; r <= R; r++) {
                for (int g = 0; g < G; g++) {
                    for (int b = 0; b <= B; b++) {
                        if (i == 0) {// 초기값 세팅
                            dp[i][r][g][b] = 1;
                            continue;
                        }
                        // 1단을 하나의 색으로만 꾸밈
                        if (r - i >= 0) dp[i][r][g][b] += dp[i - 1][r - i][g][b] * 1;
                        if (g - i >= 0) dp[i][r][g][b] += dp[i - 1][r][g - 1][b] * 1;
                        if (b - i >= 0) dp[i][r][g][b] += dp[i - 1][r][g][b - 1] * 1;
                    }
                }
            }
        }
    }
}