package SimplePrograms;
import java.util.*;
public class SimpleArrayProgram {

	
	int sum=0,avg=0,index=0;
	int userinput;
	boolean found=false;
	
	void maxElement(int[] a)
	{
		int max=a[0];		
		//Find maximum element in Array
				for(int i=0;i<a.length;i++)
				{
					if(max<a[i])
					{
						max=a[i];
					}
				}
				System.out.println("The Maximum number in array is " + max);
	}
	
	void sumofElements(int[] a)
	{
		//Sum of array elements
		for(int i =0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("The total sum of array is : "+sum);
	}

	void existElement(int[] a)
	{
		//Check if user specified item exists in Array
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the number to check in array :");
				userinput=in.nextInt();
				for(int i=0;i<a.length;i++)
				{
					if(userinput==a[i])
					{
						found = true;
						index=i;
					}
					
				}
				if(found==true)
				{
					System.out.println(userinput + " is present in Array at index position " + index);
				}else {
					System.out.println(userinput + " is not present in Array");
				}
	}
	
	void averageElements(int[] a)
	{
		//Average of array elements
		avg=sum/a.length;
		System.out.println("Average of All Array elements are: " +avg);
	}
	
	void insertElements(int[] a)
	{

		// Insert element at specific position
		a[2]=25;
		for(int element:a)
		System.out.println(element+"\t");
		System.out.println(Arrays.toString(a));
	
	}

	public static void main(String[] args) {
	
		SimpleArrayProgram sap = new SimpleArrayProgram();
		int a[]= {10,20,30,40,50};
		sap.averageElements(a);
		sap.existElement(a);
		sap.insertElements(a);
		sap.maxElement(a);
		sap.sumofElements(a);
	}

}
