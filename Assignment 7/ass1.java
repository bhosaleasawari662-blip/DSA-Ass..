
class Demo{
public static void main(String[]args){
int[] arr = {5,2,3,2,4};
int target = 2;
int result = firstoccurrence(arr,0, target);
System.out.println(result);
}
Public class first occurrence {
public static int first occurrence(int[] arr,int index,int target) {
if (index == arr.length) {
return -1;
};

if (arr[index] == target) {
return index;
}
return firstoccurrence(arr,index + 1, target);
}
}
}