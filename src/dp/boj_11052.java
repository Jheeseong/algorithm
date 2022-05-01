package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11052 {

    static int arr[];
    static Integer dp[];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        arr = new int[T + 1];
        dp = new Integer[T + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(recur(T));
    }

    static int recur(int n) {
        if (dp[n] == null) {
            dp[0] = arr[0];
            for (int i = 1; i <= n; i++) {
                dp[i] = arr[i];
                for (int j = 1; j <= i; j++) {
                    dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
                }
            }
        }
        return dp[n];
    }
}
