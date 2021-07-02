package javaProject;

public class BinarySearch {
	public static void main(String args[]) {
		System.out.println(binarySearchElem({8,9,10,5,6,5}, 0,6, 5));
	}
	
	public static int binarySearchElem(int arr[], int low, int high, int key) {
		int mid=(low+high)/2;
		while(low<=high) {
			if(arr[mid]<key) {
				low=mid+1;
			} else if(arr[mid]==key) {
				return mid;
			} else {
				high=mid+1;
			}
			mid=(low+high)/2;
		}
		if(low>high) {
			return -1;
		}
		return -1;
	}
}
