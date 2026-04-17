import java.util.Scanner;

class Demo{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter n: ");
int n = sc.nextInt();

for (int i = 0; i < n; i++) {
int num = 1;
for (int j = 0; j <= i; j++) {
System.out.print(num + " ");
num = num * (i - j) / (j + 1);
}
System.out.println();
}

}
}