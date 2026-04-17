class Demo{
   public static void main(String[]args){
   int n = 3;
   fun(n);
    }
  static void fun(int n){
    if(n<=0){
      return;
     }
    System.out.println("A:"+n);
    fun(n-1);
    System.out.println("B:"+(n*2));
  }
}