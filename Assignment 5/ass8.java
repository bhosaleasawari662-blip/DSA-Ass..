import java.util.Scanner;
 class Demo{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
    int num = sc.nextInt();
    int div = 1;
    int count = 0;
   while(div<=num){
    if(num % div == 0){
      count++;
   }
   div++;
    }
   System .out.println(count);
 }
}