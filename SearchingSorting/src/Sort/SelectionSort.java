package Sort;

public class SelectionSort {
	public static void main(String[] args) {
	int[] arr = {4, 12, 2, 17, 5};

	for(int i = 0; i < arr.length-1; i++) {
		int min = i;
		
		for(int j = i + 1; j < arr.length; j++) {
			if(arr[j] < arr[min]) {
				min = j;
		}
	}
	int temp = arr[i];
	arr[i] = arr[min];
	arr[min] = temp;
}
	
	
	for(int k = 0; k < arr.length; k++) {
		System.out.println(arr[k]);
}
}
}
