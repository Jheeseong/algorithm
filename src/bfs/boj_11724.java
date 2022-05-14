package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11724 {
    static int [][] check;
    static boolean[] checked;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (checked[i] == false) {
                dfs(i);
                res++;
            }
        }
        System.out.println(res);
    }

    static public void dfs(int i) {
        if (checked[i] == true) {
            return;
        } else {
            checked[i] = true;

            for (int j = 1; j <= n; j++) {
                if (check[i][j] == 1 && checked[j] == false) {
                    dfs(j);
                }
            }
        }
    }
}
