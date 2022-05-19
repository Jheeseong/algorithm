package algorithm;


public class kakao_2022_2 {
    public static void main(String[] args) {
        System.out.println(solution(437674, 3));;
    }
    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String k_num(int n, int k) {
        String res = "";
        while (n > 0) {
            res = n % k + res;
            n /= k;
        }
        return res;
    }
    public static int solution(int n, int k) {
        int answer = 0, i, j;
        String s = k_num(n, k);
        String[] nums = s.split("0");
        for (String num : nums) {
            if (num.equals("")) {
                continue;
            }
            if (isPrime(Long.parseLong(num))) {
                answer++;
            }
        }
        return answer;
    }
}
