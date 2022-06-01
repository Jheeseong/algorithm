package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2146 {
    static int N;
    static int[][] arr;
    static boolean[][] visit;
    static int cnt;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visit[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();
            cnt = arr[curX][curY];

            for (int n = 0; n < 4; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    if (arr[nx][ny] == 0 && !visit[nx][ny]) {
                        arr[nx][ny] = cnt + 1;
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int n = 0; n < N; n++) {
            for (int k = 0; k < N; k++) {
                for (int t = 0; t < 4; t++) {
                    int x = n + dx[t];
                    int y = k + dy[t];
                    if (x >= 0 && x < N && y >= 0 && y < N) {
                        if (arr[n][k] != arr[x][y]) {
                            ans = Math.min(ans, arr[n][k] + arr[x][y]);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
