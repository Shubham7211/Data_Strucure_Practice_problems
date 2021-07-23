import java.util.Scanner;

public class ArrayCreation {
	
	
 public static void main(String[] args) {
	
	 int n; 
 Scanner  s= new Scanner(System.in);
 System.out.println("Enter the size of the array Or enter the elements of arrays");
  n=s.nextInt();
  
  // creating array here
  int a[]=new int[n];
  System.out.println("Enter values");
  //creating for loop for storing values one by one in array n
 
  
	  for (int i=0;  i<n; i++) {
	  a[i]=s.nextInt();	  
  }
 
  System.out.println("Elements are:");
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}

  
	}
}
