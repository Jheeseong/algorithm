package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ten_res = 0;
        for (int i = 0; i < m; i++) {
            ten_res += Math.pow(A, i) * arr[m - 1 - i];
        }

        Stack<Integer> stack = new Stack<Integer>();
        while (ten_res > 0) {
            stack.push(ten_res % B);
            ten_res /= B;
        }
        while (!stack.empty()) {
            sb.append(stack.pop() + " ");
        }
        System.out.println(sb);
    }
}
