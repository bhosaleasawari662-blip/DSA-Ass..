class Demo{
public static void main(String[]args){
 for(int i=1;i<=4;i++){
  for(int j=1;j<5;j++){
 if((i+j)%2==0){
System.out.print("*  ");
}else{
System.out.print("#  ");
  }
}
System.out.println();
    }
  }
}
import java.util.Scanner;
class Demo{
   public static void  main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=sc.nextInt();

   for(int i=1;i<=n;i++){
   for(int j=1;j<=n;j++){
    if((i+j)%2==0){
    System.out.print("* ");
     }else{
    System.out.print("# ");
     }
    }
    System.out.println();
   }
  }
}