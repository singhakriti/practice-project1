package dec5Assignment;


public class RotateRightAnArray {

	public static void main(String[] args) {

		int a[]=new int[] {10,90,34,89,56,65};
		int n=5;
		
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");	
		}
		
		for(int i=0;i<n;i++) {
			int last = a[a.length-1];
			
			for(int j = a.length-1; j > 0; j--){
				a[j] = a[j-1];
			}
			a[0] = last; 
			
			System.out.println(); 
			System.out.println("Array after "+ (i+1) + " right rotation: ");    
	        for(int k = 0; k< a.length; k++){
	        	System.out.print(a[k] + " ");
	        }
		}
	}
}
