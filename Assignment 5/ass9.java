import java.util.Scanner;
class Demo{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
     int num =sc.nextInt();
     int div = 2;
   while(div<=num/2){
     if(num%div==0){
      System.out.println("Not Prime");
       break;
     }
     div++;
   }
   if(div>num/2){
    System.out.println("Prime");
    }
  }
}