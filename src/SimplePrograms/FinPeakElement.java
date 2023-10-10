package SimplePrograms;

public class FinPeakElement {

	public static void main(String[] args) {
		int[] arr = {3,6,8,3,9,3,12,5,4};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				System.out.println(arr[i]+"\t"+arr[i+1]);
			}
		}
	}

}
