package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

    Queue<Integer> list = new LinkedList<>();
    for (int i = 1; i <= T; i++) {
            list.offer(i);
        }

        sb.append("<");

        while (list.size() != 1) {
            for (int i = 0; i < N - 1; i++) {
                list.offer(list.poll());
            }
            sb.append(list.poll() + ", ");
        }
        sb.append(list.poll() + ">");
        System.out.println(sb);
    }
}
