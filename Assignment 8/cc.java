class Demo {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int k = 2;

        int[] freq = new int[100];

        for (int num : arr) freq[num]++;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == k) {
                System.out.println(i);
            }
        }
    }
}