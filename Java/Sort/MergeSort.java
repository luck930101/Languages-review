package sort;
import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] unsortedarray){
		devide(unsortedarray,0,unsortedarray.length-1);
	}
	
	public static void devide(int[]unsortedarray, int head, int tail){
		if(head>=tail){return;}
		int mid = (head + tail)/2;
		devide(unsortedarray,head, mid);
		devide(unsortedarray,mid + 1, tail);
		merge(unsortedarray,head,mid,tail);
	}
	
	public static void merge(int[] unsortedarray, int head, int mid, int tail ){
		int[] arrayA = Arrays.copyOfRange(unsortedarray, head, mid+1);
		int[] arrayB = Arrays.copyOfRange(unsortedarray, mid+1, tail+1);
		int indexA = 0;
		int indexB = 0;
		int index = head;
		
		while(indexA<arrayA.length && indexB<arrayB.length){
			if(arrayA[indexA]<arrayB[indexB]){
				unsortedarray[index++] = arrayA[indexA++];
			}
			else{
				unsortedarray[index++] = arrayB[indexB++];
			}
		}
		while(indexA<arrayA.length){
			unsortedarray[index++] = arrayA[indexA++];
		}
		while(indexB<arrayB.length){
			unsortedarray[index++] = arrayB[indexB++];
		}
	}
	
	public static void main(String[] args) {
		int[] array1 ={9,8,7,6,5,4,3,2,1};
		int[] array2 ={3,9,8,2,3,8,0,4,2,5};
		mergeSort(array1);
		mergeSort(array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
