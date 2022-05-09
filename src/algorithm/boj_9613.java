package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            Long arr[] = new Long[N];
            Long sum = 0L;
            for (int j = 0; j < N; j++) {
                arr[j] = Long.parseLong(st.nextToken());
            }
            for (int j = 0; j < N; j++) {
                for (int k = j + 1; k < N; k++) {

                    sum += gcd(arr[j], arr[k]);
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }

    static Long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
