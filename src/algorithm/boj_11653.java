package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N != 1) {
            for (int i = 2; i <= N;) {
                if (N % i == 0) {
                    sb.append(i).append('\n');
                    N /= i;
                } else {
                    i++;
                }
            }
        }
        System.out.println(sb);
    }
}
