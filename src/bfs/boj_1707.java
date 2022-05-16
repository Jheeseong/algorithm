package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1707 {
    static int check[][];
    static boolean checked[];
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            check = new int[1001][1001];
            checked = new boolean[1001];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                check[x][y] = check[y][x] = 1;
            }

            for (int i = 1; i <= n; i++) {
                dfs(i);
            }
        }
    }
    static public void dfs(int i) {
        checked[i] = true;

        for (int j = 1; j <= n; j++) {
            if (check[i][j] == 1 && checked[j] == false) {
                dfs(j);
            }
        }
    }
}
