package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2225 {

    static Integer dp[][];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new Integer[k + 1][n + 1];

        System.out.println(recur(k,n));
    }

    static int recur(int k, int n) {
        if (dp[k][n] == null) {
            for (int i = 1; i <= k; i++) {
                dp[i][0] = 1;
                for (int j = 1; j <= n; j++) {
                    dp[1][j] = 1;
                }
            }
            for (int i = 2; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    dp[i][j] %= 1000000000;
                }
            }
        }
        return dp[k][n];
    }
}
