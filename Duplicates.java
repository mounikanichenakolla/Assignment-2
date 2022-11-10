package Arrays;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		
	
		boolean flag1 =false;
		String []arr = {"Hi", "Hello", "Welcome", "To", "INeuron",  "Hi",  "INeuron"};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Elements are:" + " " +arr[j]);
					flag1 = true;
					break;
				}
			}
		}
			if(flag1 == false) {
				System.out.println("No Duplicates Found: ");
			}
		}
	}

	
	

		
		



	



