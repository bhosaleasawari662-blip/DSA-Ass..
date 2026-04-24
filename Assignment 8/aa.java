class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4};

        int max = 100; 
        int[] freq = new int[max];

        for (int num : arr) {
            freq[num]++;
        }

        int maxFreq = 0, secondMax = 0, result = 2;

        for (int i = 0; i < max; i++) {
            if (freq[i] > maxFreq) {
                secondMax = maxFreq;
                maxFreq = freq[i];
            } else if (freq[i] > secondMax && freq[i] < maxFreq) {
                secondMax = freq[i];
                result = i;
            }
        }

        System.out.println("Second Highest Frequency Element: " + result);
    }
}