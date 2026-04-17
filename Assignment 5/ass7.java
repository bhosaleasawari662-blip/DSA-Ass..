import java.util.Scanner;
class Demo{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
     System.out.println("Enter a no.");
   int num = sc.nextInt();
   int div = 1;
 while(div<=num){
      if(num%div==0){
       System.out.print(div+" ");
      div++;
      }
    }
  }
}