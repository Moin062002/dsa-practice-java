package divideandconqueror;

public class QuickSort {
	public static void printArray(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}	
	}
	public static void quickSort(int[] arr,int si, int ei) {
		if(si >= ei) {
			return;
		}
		int pvI = partition(arr, si, ei);
		quickSort(arr, si, pvI-1);
		quickSort(arr, pvI+1, ei);
		
	}
	public static int partition(int[] arr,int si,int ei) {
		int pivot = arr[ei];
		int i = si-1; // make space for elm less that pivot
		
		for(int j=si ; j<ei ; j++) {
			if(arr[j] < pivot) {
				i++;
				// swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		// put pivot in correct place
		i++;
		int temp = pivot;
		arr[ei] = arr[i]; // store int pivot  place
		arr[i] = temp;
		return i;
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 3, 9, 8, 2, 5};
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}
}
