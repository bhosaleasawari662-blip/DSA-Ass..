import java.util.Scanner;

class Demo {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter n: ");
int n = sc.nextInt();

for(int i=1;i<=n;i++){

for(int s=1;s<=n-i;s++){
System.out.print(" ");
}

int num;
if(i%2==0)
num=0;
else
num=1;

for(int j=1;j<=i;j++){
System.out.print(num+" ");

if(num==0)
num=1;
else
num=0;
}

System.out.println();
}

for(int i=n-1;i>=1;i--){

for(int s=1;s<=n-i;s++){
System.out.print(" ");
}

int num;
if(i%2==0)
num=0;
else
num=1;

for(int j=1;j<=i;j++){
System.out.print(num+" ");

if(num==0)
num=1;
else
num=0;
}

System.out.println();
}

}
}