import java.util.Scanner;
   class Demo{
     public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a no.:");
     int n = sc.nextInt();
     int num = n;
     int sum = 0;
     for(int i=1;i<n;i++){
       if(n%i==0){
         sum= sum+i;
   }
}
  if(sum==num){
      System.out.println("Perfect no.");
  }
else{
     System.out.println("Not perfect no.");
    }
  }
}