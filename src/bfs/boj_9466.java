package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_9466 {
    static ArrayList<ArrayList<Integer>> check;
    static boolean[] checked;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int res = 0;

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            int[] y = new int[N + 1];
            check = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i <= N; i++) {
                check.add(new ArrayList<>());
            }
            for (int i = 1; i <= N; i++) {
                int x = i;
                y[i] = Integer.parseInt(st.nextToken());

                check.get(y[i]).add(x);
                check.get(x).add(y[i]);
            }

            checked = new boolean[N + 1];
            for (int i = 1; i <= N; i++) {
                if (!checked[i]) {
                    res = bfs(i);
                }
            }
        }
        System.out.println(res);
    }

    static public int bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        checked[start] = true;
        int cnt = 0;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < check.get(temp).size(); i++) {
                if (!checked[check.get(temp).get(i)]) {
                    checked[check.get(temp).get(i)] = true;
                    queue.offer(check.get(temp).get(i));
                    cnt ++;
                }
            }
        }
        return cnt;
    }
}
