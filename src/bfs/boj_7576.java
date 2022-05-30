package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_7576 {
    static int arr[][];
    static int day;
    static int M,N;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visit = new boolean[N][M];
        boolean check = false;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();

        loop:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(- 1);
                    check = true;
                    break loop;
                }
            }
        }
        if (!check) {
            System.out.println(day - 1);
            check = false;
        }
    }

    static public void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visit[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            day = arr[curX][curY];
            queue.poll();

            for (int n = 0; n < 4; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (arr[nx][ny] == 0 && !visit[nx][ny]) {
                        arr[nx][ny] = day + 1;
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
    }
}
