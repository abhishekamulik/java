package SimplePrograms;

public class findallsubstrings {

	public static void main(String[] args) {
String str1="abab";
//System.out.println(str1.substring(4,10));
for(int i=0;i<=str1.length();i++) 
{
	for(int j=1;j<=str1.length()-i;j++)
	{
		System.out.println(str1.substring(i,i+j));	
	}
	
}
}

}
