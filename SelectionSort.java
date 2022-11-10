package Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	int[] ar = {23,7,4,68,30};
	System.out.println("Sorted elements:");
		
		for(int i=0;i<ar.length;i++) {
			
				 for(int j=i+1; j<ar.length; j++)  
		           {  
		               if(ar[i] > ar[j])  
		               {  
		                 int  temp = ar[i];  
		                   ar[i] = ar[j];  
		                   ar[j] = temp;  
		               }  
		           }  
		
		}
		
	
	for(int el:ar ) {
		
		System.out.print(el+" ");
	}
}
}
