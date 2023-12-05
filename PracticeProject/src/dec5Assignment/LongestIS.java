package dec5Assignment;


public class LongestIS {
	static int maxRef;
	 static int lis1(int arr[], int n)
	    {
	        
	        if (n == 1)
	            return 1;
	        
	        int res, maxEndingHere = 1;
	        for (int i = 1; i < n; i++) {
	        	res = lis1(arr, i);
	        	
	            if (arr[i - 1] < arr[n - 1]&& res + 1 > maxEndingHere)
	                maxEndingHere = res + 1;
	        }
	        if (maxRef < maxEndingHere)
	            maxRef = maxEndingHere;
	        return maxEndingHere;     
	    }
	    static int lis(int arr[], int n)
	    {
	       
	        maxRef = 1;
	        lis1(arr, n);
	        return maxRef;
	    }
	    
	    public static void main(String[] args) {
		{
	        int arr[] = { 10,9,2,5,3,7,101,18 };
	        int n = arr.length;
	        System.out.println("Length of lis is "  + lis(arr, n));
	    }
		

	}

}
