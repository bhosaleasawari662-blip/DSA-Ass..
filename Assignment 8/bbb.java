import java.util.*;

 class Demo {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > k) {
                System.out.println(key);
            }
        }
    }
}