package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_10451 {
    static ArrayList<ArrayList<Integer>> check;
    static boolean[] checked;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            check = new ArrayList<>(); // 연결 리스트
            for (int i = 0; i <= N; i++) {
                check.add(new ArrayList<>());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                int t = Integer.parseInt(st.nextToken());
                check.get(i).add(t);
            }

            checked = new boolean[N + 1];
            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                if (!checked[i]) {
                    bfs(i);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }


    static public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        checked[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < check.get(temp).size(); i++) {
                if (!checked[check.get(temp).get(i)]) {
                    checked[check.get(temp).get(i)] = true;
                    queue.offer(check.get(temp).get(i));
                }
            }
        }
    }
}
