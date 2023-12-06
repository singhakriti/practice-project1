package dec6Assignment;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c,d=0;
		
		System.out.println("Enter the size of array ");
		int n=sc.nextInt();
		
		int []a=new int[n];
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter an Element to Search: ");
		c=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(c==a[i]) {
				d=i+1;
				break;
			}
		}
		if(d==0)
	         System.out.println("\nThe element not found!");
	      else
	         System.out.println("\nThe element found at position: " +d);		

	}

}
