class {
    public static void main(String[] args) {

        int n = 4;

        
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

    int num = (i % 2 == 0) ? 0 : 1;
    for (int j = 1; j <= i; j++) {
    System.out.print(num + " ");
        num = (num == 0) ? 1 : 0;
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            int num = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 0) ? 1 : 0;
            }

            System.out.println();
        }
    }
}