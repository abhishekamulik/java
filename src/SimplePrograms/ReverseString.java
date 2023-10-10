package SimplePrograms;
import java.util.*;					
public class ReverseString {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the string to get reverse : ");
String userinput=in.next();
String result="";

for(int i=userinput.length()-1;i>=0;i--)
{
	result=result+userinput.charAt(i);
}

System.out.println("Reverse String is : " + result.toUpperCase());
	}

}
