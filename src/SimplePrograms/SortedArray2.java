package SimplePrograms;

public class SortedArray2 {

	public static void main(String[] args) {
		int a[]= {6,3,4,8,2};
		int temp=0;
		
		for(int i=0;i<a.length-1;i++)//0	0	0	0	0	
		{
			for(int j=i+1;j<a.length;j++)//	0	0	0	0	0
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println("Inside if block");
				}
				System.out.println(i +"\t"+a[i] +"\t"+ a[j] +"\t"+j);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println();
			System.out.print(a[i] + "\t");
		}
	}

}
