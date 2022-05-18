package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9466 {
    static int[] arr;
    static boolean[] visit,done;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            arr = new int[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            visit = new boolean[N + 1];
            done = new boolean[N + 1];
            cnt = 0;
            for (int i = 1; i <= N; i++) {
                if (!done[i]) {
                    explore(i);
                }
            }
            System.out.println(N - cnt);
        }
    }

    public static void explore(int start) {
        visit[start] = true;

        if (!visit[arr[start]]) {
            explore(arr[start]);
        } else {
            if (!done[arr[start]]) {
                cnt++;
                while (arr[start] != start) {
                    cnt++;
                    arr[start] = arr[arr[start]];
                }
            }
        }
        done[start] = true;
    }
}
