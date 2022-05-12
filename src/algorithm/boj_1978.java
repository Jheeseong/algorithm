package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int res = 0;
        for (int i = 0; i < T; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] != 1) {
                    if (arr[i] % j == 0) {
                        cnt ++;
                    }
                }
            }
            if (cnt == 2) {
                res++;
            }
            cnt = 0;
        }
        sb.append(res);
        System.out.println(sb);
    }
}
