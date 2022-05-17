package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1707_2 {
    static int[][] check;
    static boolean[] checked;
    static int[] color;
    static int V;
    static int E;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            check = new int[1001][1001];
            checked = new boolean[1001];
            color = new int[1001];

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                check[x][y] = check[y][x] = 1;
            }

            for (int i = 1; i <= V; i++) {
                if (color[i] == 0) {
                    color[i] = 1;
                    bfs(i);
                }
            }
            System.out.println(check(V));
        }
    }

    static public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        checked[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            int c = color[temp];

            for (int i = 1; i <= V; i++) {
                if (check[temp][i] == 1 && checked[i] == false) {
                    if (c == 1) {
                        color[i] = -1;
                    } else if (c == -1) {
                        color[i] = 1;
                    }
                    queue.offer(i);
                    checked[i] = true;
                }
            }
        }
    }

    static public String check(int V) {
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= V; j++) {
                if (check[i][j] == 1 && checked[j] == true) {
                    if (color[i] == color[j]) {
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}
