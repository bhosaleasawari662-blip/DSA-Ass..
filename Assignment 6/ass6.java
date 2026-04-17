class Demo{
   public static void main(String[]args){
   int n = 8;
   fun(n);
    }
   static void fun(int n){
      if(n<=1){
        System.out.println(n);
        return;
    }
   System.out.println(n);
   fun(n/2);
   System.out.println(n);
  }
}