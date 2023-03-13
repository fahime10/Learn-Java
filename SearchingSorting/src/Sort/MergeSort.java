package Sort;

public class MergeSort {
	
	public void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, start, middle + 1, end);
	}
	}
		
		public void merge(int[] arr, int start, int middle, int end) {
			int[] temparr = new int[end - start + 1];
			
			int i = start;
			int j = middle;
			int k = 0;
			
			while(i < middle && j <= end) {
				if(arr[i] <= arr[j]) {
					temparr[k] = arr[i];
					i++;
				} else {
					temparr[k] = arr[j];
					j++;
				}
				k++;
			}
			
			while(i < middle) {
				temparr[k] = arr[i];
				k++;
				j++;
			}
			
			while(j <= end) {
				temparr[k] = arr[j];
				k++;
				j++;
			}
			
			for(int x = 0; x < temparr.length; x++) {
				arr[start + x] = temparr[x];
			}
		}

	public static void main(String[] args) {
		int[] arr = {4, 12, 2, 17, 5};
		

	}

}
