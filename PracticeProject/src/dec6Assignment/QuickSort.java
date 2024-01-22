package dec6Assignment;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {65,78,66,43,23,55,32};
	    System.out.println("Unsorted array: " + Arrays.toString(arr));

	    quicksort(arr, 0, arr.length - 1);

	    System.out.println("Sorted array: " + Arrays.toString(arr));
	  }

	  public static void quicksort(int[] arr, int start, int end) {

	    if(arr != null && arr.length <= 1) {
	      return;
	    }

	    if (start < end) {

	      int pivotIndex = partition(arr, start, end);
	      quicksort(arr, start, pivotIndex - 1);
	      quicksort(arr, pivotIndex + 1, end);
	    }
	  }

	  public static int partition(int[] arr, int start, int end) {

	    int pivot = arr[start];
	    int i = start;
	    for (int j = start + 1; j <= end; j++) {
	      if (arr[j] < pivot) {
	        i++;
	        swap(arr, i, j);
	      }
	    }
	    swap(arr, start, i);
	    return i;
	  }

	  public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;

	}

}
