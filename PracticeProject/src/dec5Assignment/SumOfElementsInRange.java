package dec5Assignment;

import java.util.Scanner;

public class SumOfElementsInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of L: ");
        int L = sc.nextInt();
        System.out.print("Enter the value of R: ");
        int R = sc.nextInt();
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of elements in the range of L and R is: " + sum);
		

	}

}
