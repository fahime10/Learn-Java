package Sort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {4, 12, 2, 17, 5};
		
		/*for(int i = arr.length - 1; i > 0; i--) {
			for (int j = 1; j < i + 1; j++) {
				if(arr[j -1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr [j -1];
					arr[j - 1] = temp;
				}
			}
		}*/
		
		
		boolean didSwap = true;
		int i = arr.length - 1;
		while(didSwap) {
			didSwap = false;
			
			for(int j = 1; j < i + 1; j++) {
				if(arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				didSwap = true;
			}
		}
			i--;
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);

	}
	}
}
