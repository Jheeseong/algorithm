package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10845 {
    public static int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        stack = new int[T];

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int i = stack[0];
            stack[0] = 0;
            size--;
            return i;
        } else {
            int i = stack[0];
            for (int j = 0; j < size - 1; j++) {
                stack[j] = stack[j + 1];
            }
            stack[size - 1] = 0;
            size--;
            return i;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (size == 0) {
            return -1;
        } else {
            return stack[0];
        }
    }

    public static int back() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }

}
