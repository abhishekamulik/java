package SimplePrograms;

public class MaxandMinArray {
	
	public void minArray(int arr[])
	{
		int min=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum number from Array is : " + min);
	}
	
	public void maxArray(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum number from Array is : " +max);
	}

	public static void main(String[] args) {
		int[] arr = {3,6,8,3,9,3,12,5,4};
		MaxandMinArray minarr=new MaxandMinArray();
		minarr.minArray(arr);
		minarr.maxArray(arr);
}
}