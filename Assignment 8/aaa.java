import java.util.*;
 class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0, secondMax = 0, result = 2;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq) {
                secondMax = maxFreq;
                maxFreq = freq;
            } else if (freq > secondMax && freq < maxFreq) {
                secondMax = freq;
                result = key;
            }
        }

        System.out.println("Second Highest Frequency Element: " + result);
    }
}