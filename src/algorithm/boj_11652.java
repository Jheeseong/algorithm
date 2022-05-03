package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11652 {
    static int cnt[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        cnt = new int[100001];
        for (int i = 0; i < T; i++) {
            cnt[Integer.parseInt(br.readLine())] ++;
        }
        br.close();

        for (int i = 1; i < 100001; i++) {
            if (cnt[i] > 0) {
                int max = Math.max(cnt[i], cnt[i - 1]);
                if (cnt[i] == max) {
                    sb.append(i);
                    break;
                }
            }

        }
        System.out.println(sb);
    }
}
