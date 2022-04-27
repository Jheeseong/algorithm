package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1912 {

    static int arr[];
    static Integer r_dp[];
    static Integer i_dp[];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        arr = new int[T];
        r_dp = new Integer[T];
        i_dp = new Integer[T];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < T; i++) {
            LIS(i);
            LDS(i);
        }


        int max = r_dp[0] + i_dp[0] - 1;

        for (int i = 1; i < T; i++) {
            max = Math.max(max, r_dp[i] + i_dp[i] - 1);
        }
        System.out.println(max);
    }

    static int LIS(int n) {
        if (r_dp[n] == null) {
            r_dp[n] = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < arr[n]) {
                    r_dp[n] = Math.max(r_dp[n], LIS(i) + 1);
                }
            }
        }
        return r_dp[n];
    }

    static int LDS(int n) {
        if (i_dp[n] == null) {
            i_dp[n] = 1;
            for (int i = n + 1; i < i_dp.length; i++) {
                if (arr[i] < arr[n]) {
                    i_dp[n] = Math.max(i_dp[n], LDS(i) + 1);
                }
            }
        }
        return i_dp[n];
    }
}
