package Arrays;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] firstArray = {98,56,38,29,54};
		int [] secondArray = {85,78,34,72,11};
		int length = firstArray.length + secondArray.length;
		int p=0;
		int [] mergedArray = new int [length];
		
		for(int el : firstArray) {
			mergedArray[p]=el;
			p++;
		}
		for(int el : secondArray) {
			mergedArray[p]=el;
			p++;
		}
		Arrays.toString(mergedArray);
		Arrays.sort(mergedArray);
		System.out.println("The MergeSort Array is:"+" " +Arrays.toString(mergedArray));
	
	
	}

}
