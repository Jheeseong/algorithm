package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_4963 {
    static int [][] arr;
    static boolean [][] check;
    static int dx[] = {-1, 0, 1, -1, 1, -1 ,0, 1};
    static int dy[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int w;
    static int h;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            arr = new int[h][w];
            check = new boolean[h][w];
            if (w == 0 && h == 0) {
                break;
            }

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            cnt = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == 1 && !check[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }
    public static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        check[i][j] = true;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();

            for (int n = 0; n < 8; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];

                if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                    if (arr[nx][ny] == 1 && !check[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        check[nx][ny] = true;
                    }
                }
            }

        }



    }

}
