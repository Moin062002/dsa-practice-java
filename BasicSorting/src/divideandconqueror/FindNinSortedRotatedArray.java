package divideandconqueror;

public class FindNinSortedRotatedArray {
	public static int findNinSortedRotatedArray(int[] arr, int si,int ei,int target) {
		int mid = si+(ei-si)/2;
		if(si > ei) {
			return -1;
		}
		if(arr[mid] == target) {
			return mid;
		}
		// line 1
		if(arr[si] < arr[mid]) {
			if(arr[si]  <= target && target <= arr[mid]) {
				return findNinSortedRotatedArray(arr, si,mid-1, target);
			} else {
				return findNinSortedRotatedArray(arr, mid+1, ei, target);
			}	
		} // line 2
		else {
			if(arr[mid] <= target && target <= arr[ei]) {
				return findNinSortedRotatedArray(arr, mid+1, ei, target);
			} else {
				return findNinSortedRotatedArray(arr, si, mid-1, target);
			}	
		}		
	}
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
	System.out.println(findNinSortedRotatedArray(arr,0,arr.length-1,target));	
	}
}