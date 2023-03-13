package Sort;

public class QuickSort {

	public void quickSort(int[] arr, int start, int end) {
		if(end - start >= 1) {
			int pivot = (start + end) / 2; //middle item as pivot
			
			int middle = partition(arr, start, end, arr[pivot]); //partition and find new middle
			
			quickSort(arr, start, middle);
			quickSort(arr, middle + 1, end); //Recursively sort both sublists
		}
	}
	
	public int partition(int[] arr, int start, int end, int pivot) {
		int temp;
		int i = start - 1;
		int j = end + 1;
		
		while(true) {
			do {
				i++;
			} while(arr[i] < pivot); //Step along until you find an item on the left that is larger than the pivot
				do {
					j--;
				} while(arr[j] > pivot); //On the right side look for elements less than the pivot
				if(i < j) {
					temp = arr[i];
					arr[i] = arr[j]; //swap
					arr[j] = temp;
				} else {
					return j; //end loop and return new middle
				}
			
		}
	}
}
