package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class samsung_sw_4 {
    static int res;
    static char[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int N = Integer.parseInt(st.nextToken());
            arr = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                arr[j] = s.charAt(j);
            }
            if (arr.length < N) {
                N = arr.length;
            }
            res = 0;
            dfs(N, 0);

            System.out.printf("#%d %d\n",i,res);
        }
    }

    public static void dfs(int cnt, int start) {
        if (cnt == 0) {
            res = Math.max(res, Integer.parseInt(String.valueOf(arr)));
            return;
        }
        for (int i = start; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char stri = arr[i];
                char strj = arr[j];

                arr[i] = strj;
                arr[j] = stri;
                dfs(cnt - 1, i);
                arr[i] = stri;
                arr[j] = strj;
            }
        }
    }
}
