package SimplePrograms;

public class minimumNumberArray {

	public static void main(String[] args) {
		int a[]= {3,5,6,7,9};
		int min=a[0];
		
		for(int i=0;i<5;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number in Array is : " + min);
		
	}

}
