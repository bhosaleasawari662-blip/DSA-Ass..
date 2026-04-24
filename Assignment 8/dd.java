class Demo{
public static void main(String[]args){
    int max = 100; 
    int[] freq = new int[max];

    for (int num : arr) {
        freq[num]++;
    }

    for (int num : arr) {
        if (freq[num] == 1) {
            System.out.print(num + " ");
        }
    }
}
}