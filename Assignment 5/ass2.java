import java.util.Scanner;
class Demo{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
    int num = sc.nextInt();

     while(num>0){
     int rem = num%10;
     System.out.println(rem);
     num = num/10;
    }
  }
}