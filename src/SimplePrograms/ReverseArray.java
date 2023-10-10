package SimplePrograms;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {9,5,2,4,8,1,3};
		System.out.println("Before Reversing : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int temp=0;
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("After Reversing : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
