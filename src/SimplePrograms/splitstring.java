package SimplePrograms;
import java.util.Scanner;

public class splitstring {

	public static void main(String[] args) {
System.out.println("Enter the sentence to split :");
Scanner in = new Scanner(System.in);
String userinput=in.nextLine();
String[] stringarray=userinput.split(" ");
System.out.println(stringarray.length);
for(String s:stringarray)
{
	System.out.println(s);
}
	}

}
