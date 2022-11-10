package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		
		int [] a = {9,4,7,3,8,5,2,6};
		Arrays.sort(a);
		for(int el:a) {
			
			System.out.print(el+" ");
			
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Key");
		int key =  scan.nextInt();
		
		int low = 0;
		int high =a.length-1;
		
		while(low<=high) 
		{
			int mid = (low+high)/2;
				if(key==a[mid]) 
				{
				System.out.println("Key"+" " +key +" "+ "Found at Index"+" " +mid);
				break;
				}
				else if(key<a[mid]) 
				{
					high = mid-1;
				}
				else if(key >a[mid])
				{
					low=mid+1;
				}
					
		}
				if(low>high) {
					System.out.println("Key Not fOund");
				}
					
					
				}
			}
		
		
