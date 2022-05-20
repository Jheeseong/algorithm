package algorithm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kakao_2022_3 {
    public static void main(String[] args) {
    }


    public static int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>();
        Map<String, Integer> times = new HashMap<>();
        List<String> cars = new ArrayList<>();

        for (String record : records) {
            String[] rc = record.split(" ");
            int time = getMin(rc[0]);
            String car_num = rc[1];

            if (!cars.contains(car_num)) {
                cars.add(car_num);
                times.put(car_num, 0);
            }

            if (parking.containsKey(car_num)) {
                times.put(car_num, times.get(car_num) + (time - parking.get(car_num)));
            }

        }
        int[] ret = new int[cars.size()];
        return ret;
    }

    public static int getMin(String time) {
        String[] t = time.split(":");
        return Integer.valueOf(t[0])*60 + Integer.valueOf(t[1]);
    }
}
