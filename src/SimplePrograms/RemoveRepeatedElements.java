package SimplePrograms;
import java.util.*;
public class RemoveRepeatedElements {

	/*public static void main(String[] args) {

		int [] arr = {3,6,2,8,3,6,4,8,3,5,2};
		int[] temparr=new int[100];
		
		int index=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]!=temparr[j])
				{
					temparr[index++] = arr[j];
					break;
				}
				else
				{
					break;
				}
			}
		}
		int[] newarr=new int[index];
		System.arraycopy(temparr, 0, newarr, 0, index);
		
		for(int k=0;k<temparr.length-1;k++)
		{
			System.out.print(newarr[k] +" ");
		}
	}*/
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1, 7, 8, 9, 7, 5};

	        int[] uniqueArr = removeDuplicates(arr);

	        System.out.println("Array with duplicates: ");
	        printArray(arr);

	        System.out.println("\nArray without duplicates: ");
	        printArray(uniqueArr);
	    }

	    public static int[] removeDuplicates(int[] arr) {
	        int[] uniqueArr = new int[arr.length];
	        int index = 0;

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            // Check if the element is already present in the uniqueArr
	            for (int j = 0; j < index; j++) {
	                if (arr[i] == uniqueArr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not a duplicate, add it to the uniqueArr
	            if (!isDuplicate) {
	                uniqueArr[index++] = arr[i];
	            }
	        }

	        // Resize the uniqueArr to remove the unused elements
	        int[] resizedArr = new int[index];
	        System.arraycopy(uniqueArr, 0, resizedArr, 0, index);

	        return resizedArr;
	    }

	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}