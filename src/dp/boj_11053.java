package dp;

import java.io.*;
import java.util.StringTokenizer;

public class boj_11053 {

    static int arr[];
    static Integer dp[];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        arr = new int[T];
        dp = new Integer[T];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < T; i++) {
            LIS(i);
        }

        int max = dp[0];

        for (int i = 1; i < T; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    static int LIS(int n) {
        if (dp[n] == null) {
            dp[n] = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < arr[n]) {
                    dp[n] = Math.max(dp[n], LIS(i) + 1);
                }
            }
        }
        return dp[n];
    }
}
