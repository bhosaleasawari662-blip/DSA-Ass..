import java.util.Scanner;
import java.lang.Math;
  class Demo{
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int a = sc.nextInt();
      System.out.println("Enter a number");
     int b = sc.nextInt();

    int greatest=0;

   for(int i=1;i<Math.min(a,b);i++){
     if(a%i==0 && b%i==0){
        if(i>greatest){
          greatest=i;
       }
     }
  }
   System.out.print(greatest);
  }
}