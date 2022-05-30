package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        //5를 나누면서 누적합 계산
        while (N >= 5) {
            cnt += N / 5;
            N /= 5;
        }
        System.out.println(cnt);
    }
}
