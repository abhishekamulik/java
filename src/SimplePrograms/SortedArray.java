package SimplePrograms;

public class SortedArray {

	public static void main(String[] args) {
int a[]=new int[5];
a[0]=3;
a[1]=2;
a[2]=6;
a[3]=0;
a[4]=1;

int min=a[0];
int temp;
for(int i=0;i<a.length-1;i++)
{
	for(int  j=i+1;j<a.length;j++)
	{
	if(a[i]>a[j]) 
	{

		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
}
}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}
