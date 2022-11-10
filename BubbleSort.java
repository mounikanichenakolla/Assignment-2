

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		char [] a =  {'m','o','u','n','i','I','N','e','u','r','o','n'};
		
		for(int i=0;i<a.length;i++ ) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					char temp = a[j];
					a[j]=a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for(int el:a)
		{
	System.out.println(el+ " ");
		}
	}
}
