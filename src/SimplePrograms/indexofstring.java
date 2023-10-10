package SimplePrograms;

import java.util.Scanner;

public class indexofstring {

	public static void main(String[] args) 
	{
		String userinput="ababaaabbbabab";
		System.out.println("Please refer the string as - " + userinput);
		System.out.println("Enter the string to get Index of : ");
		Scanner in = new Scanner(System.in);
		String stringindex=in.nextLine();
		int position=0;
		
		for(int i=0;i<userinput.length();i++) 
		{
		position=userinput.indexOf(stringindex,4);
		}
		if(position==-1)
		{
			System.out.println("Entered substring doesn't found in user input string");
		}
		else {
			System.out.println(position +" is Index of position in string");		
		}
	}

}
