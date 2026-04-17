class Demo{
  public static void main(String[]args){
  int[]arr={3,9,1,7};
  int ans=fun(arr,0);
  System.out.println(ans);
 }
  static int fun(int[]arr,int index){
   if(index==arr.length-1){
    return arr[index];
  }
  int min=fun(arr,index+1);

  if(arr[index]<min){
     return arr[index];
 }else{
   return min;
    }
  }
}