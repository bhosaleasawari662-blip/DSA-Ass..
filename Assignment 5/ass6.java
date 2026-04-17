import java.util.Scanner;
class Demo{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no.");
   int num = sc.nextInt();
   int temp = num;
   int count = 0;
   int sum = 0;
   int arm = num;
   while(num>0){
   int rem= num%10;
   count++;
    num = num/10;
  }
   while(temp>0){
    int rem = temp%10;
     sum+= Math.pow (rem,count);
     temp = temp/10;
    }
      if(sum==arm){
      System.out.println("Armstrong no.");
  }
    else{
      System.out.println("Not Armstrong no.");
    }    
  }
}