package sort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] unsortedarray){
		int temp;
		for(int i = unsortedarray.length-1;i >0; i--){
			for(int j = 0;j < i; j++){
				if(unsortedarray[j]>unsortedarray[i]){
					temp = unsortedarray[j];
					unsortedarray[j] = unsortedarray[i];
					unsortedarray[i] = temp;
				}
			}		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 ={9,8,7,6,5,4,3,2,1,1};
		int[] array2 ={3,9,8,2,3,8,0,4,2,5};
		bubbleSort(array1);
		bubbleSort(array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
