package algorithm;


import java.util.*;

public class kakao_2022_3 {
    public static void main(String[] args) {
    }


    public static int[] solution(int[] fees, String[] records) {
        int lastTime = getMin("23:59");
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
                parking.remove(car_num);
            }

        }
        int[] ret = new int[cars.size()];
        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            ret[i] =fees[1];
            String car = cars.get(i);
            int time = times.get(car) - fees[0];
            if (parking.containsKey(car)) {
                time += (lastTime - parking.get(car));
            }
            if (time > 0) {
                ret[i] += (Math.ceil(time / (fees[2] * 1.0)) * fees[3]);
            }
        }
        return ret;
    }

    public static int getMin(String time) {
        String[] t = time.split(":");
        return Integer.valueOf(t[0])*60 + Integer.valueOf(t[1]);
    }
}
