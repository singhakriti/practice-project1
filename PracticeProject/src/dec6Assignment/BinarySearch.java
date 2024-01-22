package dec6Assignment;

class BinarySearch {
	int binarySearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } 
            else if (arr[mid] > x) {
                r = mid - 1;
            }
            else {
              l = mid + 1;
            }  
        }
        return -1;
    }
 
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
 
        int a[] = {24,43,54,18,40};
        int n = a.length;
        int search = 10;
        int result = ob.binarySearch(a, 0, n - 1, search);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
	


	
