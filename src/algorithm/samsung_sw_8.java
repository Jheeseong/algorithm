package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class samsung_sw_8 {
    static int[] done;
    static int N;
    static int cnt;
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tn = 1; tn <= T; tn++) {
            N = Integer.parseInt(br.readLine());
            cnt = 0;

            done = new int[N];

            check(0);
            System.out.println("#" + tn + " " + cnt);
        }
    }

    public static void check(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            done[depth] = i;

            if (Possibility(depth)) {
                check(depth + 1);
            }
        }
    }

    public static boolean Possibility(int col) {

        for (int i = 0; i < col; i++) {
            if (done[col] == done[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(done[col] - done[i])) {
                return false;
            }
        }
        return true;
    }

}
