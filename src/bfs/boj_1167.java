package bfs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1167 {
    static ArrayList<Node>[] list;
    static boolean[] visit;
    static int cnt = 0;
    static int node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        list = new ArrayList[T + 1];
        for (int i = 1; i <= T; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            while (true) {
                int b = Integer.parseInt(st.nextToken());
                if (b == -1) break;
                int cost = Integer.parseInt(st.nextToken());
                list[a].add(new Node(b, cost));
            }
        }

        visit = new boolean[T + 1];
        dfs(1, 0);

        visit = new boolean[T + 1];
        dfs(node, 0);

        System.out.println(cnt);
    }

    public static void dfs(int x, int len) {
        if (len > cnt) {
            cnt = len;
            node = x;
        }
        visit[x] = true;

        for (int i = 0; i < list[x].size(); i++) {
            Node n = list[x].get(i);
            if (visit[n.e] == false) {
                dfs(n.e, n.cost + len);
                visit[n.e] = true;
            }
        }
    }

    public static class Node {
        int e;
        int cost;

        public Node(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }
    }
}
