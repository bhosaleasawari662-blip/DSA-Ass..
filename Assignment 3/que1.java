import java.util.scanner;

class Demo{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print(Enter the value for n: ");
      
      int n = scanner.nextInt();
      scanner.close();
  
for (int i = 1; i <= n; i++) {
  for (int s = n; s > i; s--)
  System.out.print(" ");
  }

  for (int j = 1; j <= i; j++)
  System.out.print(j + " ");
  }
  System.out.println();
  }
    for (int i = n - 1; i >= 1; i--) {
    for (int s = n; s > i; s--)
     System.out.print(" ");
     }

     for (int j = 1; j <= i; j++)
     System.out.print(j + " ");
     }

     System.out.println();
        
    }
}