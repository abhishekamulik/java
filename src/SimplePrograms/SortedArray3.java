package SimplePrograms;

public class SortedArray3 {

	public static void main(String[] args) {
		int[] arr ={10,3,8,9,7,4,12,5,4};
		int temp;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
