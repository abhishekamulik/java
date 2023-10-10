package SimplePrograms;

public class duplicateinarray {

	public static void main(String[] args) {
		int[] arr={3,6,8,9,7,4,12,5,4};
		Boolean isDuplicate=false;
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					isDuplicate=true;
					System.out.println("Duplicate found of "+arr[i]);
				}
			}
		}
		if(isDuplicate==true)
		{
			System.out.println("Array contains duplicate elements");	
		}
		else if(isDuplicate==false) {
			System.out.println("Array doesn't contains duplicate elements");
		}
	}

}
