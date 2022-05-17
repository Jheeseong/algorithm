package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1707 {
    static int[] color;
    static ArrayList<ArrayList<Integer>> graph;
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            color = new int[n];
            graph = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph.get(y - 1).add(x - 1);
                graph.get(x - 1).add(y - 1);
            }

            for (int i = 0; i < n; i++) {
                if (color[i] == 0) {
                    color[i] = 1;
                    bfs(i);
                }
            }
            System.out.println(check(n));
        }
    }
    static public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
            int n = queue.poll();
            int c = color[n];

            for (int i = 0; i < graph.get(n).size(); i++) {
                int n2 = graph.get(n).get(i);

                if (color[n2] == 0) {
                    if (c == 1) {
                        color[n2] = -1;
                    } else if (c == -1) {
                        color[n2] = 1;
                    }
                    queue.offer(n2);
                }
            }
        }
    }

    static public String check(int N) {
        for (int n = 0; n < N; n++) {
            for (int m = 0; m < graph.get(n).size(); m++) {
                if (color[n] == color[graph.get(n).get(m)]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
