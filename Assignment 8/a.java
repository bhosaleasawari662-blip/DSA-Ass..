import java.util.*;

 class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4};

        int n = arr.length;
        int maxFreq = 0, secondMax = 0;
        int result = 2;

        for (int i = 0; i < n; i++) {
            int count = 0;
        for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) count++;
            }

            if (count > maxFreq) {
                secondMax = maxFreq;
                maxFreq = count;
            } else if (count > secondMax && count < maxFreq) {
                secondMax = count;
                result = arr[i];
            }
        }

        System.out.println("Second Highest Frequency Element: " + result);
    }
}