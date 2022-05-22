package algorithm;

import java.util.Arrays;

public class Dev_Match_2021 {
    public static void main(String[] args) {
        int[] lottos = {32, 11, 44, 0, 5, 18};
        int[] win_num = {31, 10, 45, 1, 6, 19};
        System.out.println(solution(lottos,win_num));
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer  = new int[2];
        int cnt = 0;
        int res = 0;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
            if (lottos[i] == 0) {
                res++;
            }
        }
        answer = rank(cnt, res);
        return answer;
    }

    public static int[] rank(int cnt, int res) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;
        switch (cnt) {
            case 0:
                answer[1] = 6;
                if (res == 6) {
                    answer[0] = 1;
                } else {
                    answer[0] = 6;
                }
                return answer;
            case 1:
                min = 6;
                break;
            case 2:
                min = 5;
                break;
            case 3:
                min = 4;
                break;
            case 4:
                min = 3;
                break;
            case 5:
                min = 2;
                break;
            case 6:
                min = 1;
        }
        max = min - res;
        answer[0] = max;
        answer[1] = min;

        return answer;
    }
}
