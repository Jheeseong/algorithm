package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        long card[] = new long[T];
        for (int i = 0; i < T; i++) {
            card[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(card);

        int cnt = 1, Max = 1;
        long ans = card[0];
        for (int i = 1; i < T; i++) {
            if (card[i] == card[i - 1]) {
                cnt += 1;
            } else {
                cnt = 1;
            }
            if (Max < cnt) {
                Max = cnt;
                ans = card[i];
            }
        }
        sb.append(ans).append("\n");
        System.out.println(sb);
    }
}
