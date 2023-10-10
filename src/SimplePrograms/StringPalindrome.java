package SimplePrograms;
import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String result="";
		System.out.println("Enter the String : ");
		String userinput=in.nextLine();
		
		for(int i=userinput.length()-1;i>=0;i--)
		{
			System.out.print(userinput.charAt(i));
			result=result+userinput.charAt(i);
		}
		System.out.println("");
		if(userinput.equals(result))
		{
			System.out.println(userinput+" and "+result+ " Strings are Palindrome");
		}
		else
		{
			System.out.println(userinput+" and "+result+" strings are not Palindrome");
		}
	}

}
