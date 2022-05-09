package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Stack<Character> leftStack = new Stack<Character>();
        Stack<Character> rightStack = new Stack<Character>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L":
                    if (!leftStack.empty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case "D":
                    if (!rightStack.empty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case "B":
                    if (!leftStack.empty()) {
                        leftStack.pop();
                    }
                    break;
                case "P":
                    String s = st.nextToken();
                    leftStack.push(s.toCharArray()[0]);
                    break;
            }
        }
        while (!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.empty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
