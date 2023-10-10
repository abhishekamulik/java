package SimplePrograms;
import java.util.*;
public class IntegerPalindrome {

	public static void main(String[] args) {

		System.out.println("Enter a number to verify Palindrome ");
		Scanner in = new Scanner(System.in);
		int userinput=in.nextInt();
		int temp=userinput;
		int result=0;
		
		while(userinput>0)
		{
			result=userinput%10;
			userinput=userinput/10;
			System.out.print(result);
		}
		System.out.println("");
		if(temp==result)
		{
			System.out.println(temp +" is Palindrome number");
		}
		else
		{
			System.out.println(temp +" is not Palindrome number");
		}
	}

}
