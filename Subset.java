
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declaring two arrays
        int[] arr1 = {1, 2, 3, 4, 6, 8, 9};
        System.out.println("First array is : ");
        printArray(arr1);
        
        int[] arr2 = {1, 2, 4, 9};
        System.out.println("Second array is : ");
        printArray(arr2);
        
       
        
        // calling isSubset method
        if(isSubset(arr1, arr2))
            System.out.println("Second array is the Subset of first array");
        else
            System.out.println("Second array is not Subset of first array");
    }
    static boolean isSubset(int[] arr1, int[] arr2) 
    {
        //If length of two arrays are not same return false
        if (arr1.length < arr2.length) 
            return false;
         int j;
           
        for (int i = 0; i < arr2.length; i++) 
        {
            for ( j = 0; j < arr1.length; j++)
                if (arr2[i] == arr1[j])
                    break;
            if (j == arr1.length)
                return false;
        }
        return true;
    }
    
    static void printArray(int[] arr) 
    { 
        for (int i=0; i<arr.length; i++) 
        { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println("");
    }

	}

