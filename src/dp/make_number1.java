package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class make_number1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        br.close();

        System.out.println(recur(n,0));
    }

    static int recur(int N, int cnt) {
        if (N < 2) {
            return cnt;
        }
        return Math.min(recur(N/2, cnt +1+(N%2)),recur(N / 3, cnt + 1 + (N % 3)));
    }
}
