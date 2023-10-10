package SimplePrograms;

public class subarraysumequaltozero {

	public static void main(String[] args) {
		int[] arr= {3,6,8,3,-3,3,12,5,4};
		Boolean sumzero=false;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if((arr[i]+arr[i+1])==0)
			{
				System.out.println("Sum of subarray " + arr[i]+ " and "+arr[i+1] +" is Zero" );
				sumzero=true;
			}

		}
		if(sumzero==false)
		{
			System.out.println("No Subarray with Zero sum found in array");
		}
	}

}
