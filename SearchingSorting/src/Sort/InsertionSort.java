package Sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {4, 12, 2, 17, 5};
		
		/*for(int i = 1; i < arr.length; i++) {
			int j = 0;
			
			while(j < i && arr[i] > arr[j]) {
				j++;
			}
			int temp = arr[i];
			for(int k = i; k > j; k--) {
				arr[k] = arr[k - 1];
			}
			arr[j] = temp;
		}*/
		
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			
			while(j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				arr[j -1] = temp;
				j--;
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
	}

	}

}
