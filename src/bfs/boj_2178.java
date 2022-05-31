package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2178 {
    static int arr[][];
    static int day;
    static int M,N;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        bfs(0, 0);

        System.out.println(arr[N - 1][M - 1]);
    }

    static public void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visit[i][j] = true;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            day = arr[curX][curY];
            queue.poll();

            for (int n = 0; n < 4; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (arr[nx][ny] == 1 && !visit[nx][ny]) {
                        arr[nx][ny] = day + 1;
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
    }
}
