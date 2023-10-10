package SimplePrograms;
import java.util.*;
public class ReverseWordsofString {

	public static void main(String[] args) {
		String temp="",reverse="";
Scanner in=new Scanner(System.in);
System.out.println("Enter the Sentence to reverse : ");
String originalstring = in.nextLine();


String[] splitstring=originalstring.split(" ");

for(int i=0;i<=splitstring.length-1;i++)
{
	for(int j=splitstring[i].length()-1;j>=0;j--)
	{
		temp=temp+splitstring[i].charAt(j);
	}
	temp=temp+" ";
}
reverse=reverse+" "+temp;
System.out.println("Reverse String is " + reverse);	
	}

}
