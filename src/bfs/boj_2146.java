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
    static int[][] groupArr;
    static boolean[][] visit;
    static int cnt;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int num = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visit = new boolean[N][N];
        groupArr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] != 0 && !visit[i][j]) {
                    landNum(i, j);
                }
            }
        }
        visit = new boolean[N][N];
        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        int min = Integer.MAX_VALUE;
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
            int index = arr[curX][curY];

            for (int n = 0; n < 4; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    if (arr[nx][ny] == 0 && !visit[nx][ny]) {
                        arr[nx][ny] = cnt + 1;
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                        if (arr[nx][ny] != index) {
                            min = Math.min(min, arr[curX][curY]);
                        }
                    }
                }
            }
        }
        return min;
    }

    public static void landNum(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visit[i][j] = true;
        arr[i][j] = num;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();

            for (int n = 0; n < 4; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    if (arr[nx][ny] == 1 && !visit[nx][ny]) {
                        arr[nx][ny] = num;
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
        num++;
    }
}
