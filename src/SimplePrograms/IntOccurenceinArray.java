package SimplePrograms;
import java.util.*;
public class IntOccurenceinArray {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] arr = {3,6,8,3,9,3,12,5,4};
		Boolean isPresent=false;
		System.out.println("Array : ");
				for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the number to check in Array : ");
		int userinput = in.nextInt();
		
		for (int i=0;i<arr.length;i++)
		{
			if(userinput==arr[i])
			{
				isPresent=true;
				break;
			}
			else
			{
				isPresent=false;
			}
		}
		if(isPresent)
		{
			System.out.println("User Entered number "+userinput+ " is present in Array ");
		}
		else
		{
			System.out.println("User Entered number "+userinput+ " is NOT present in Array ");		
		}
		
	}

}
