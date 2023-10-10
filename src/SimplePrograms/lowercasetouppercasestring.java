package SimplePrograms;
import java.util.Scanner;
public class lowercasetouppercasestring {

	public static void main(String[] args) {
System.out.println("Enter the string to conver from Lower case to Upper case :");
Scanner in = new Scanner(System.in);
String userinput=in.nextLine();
System.out.println(userinput.replace("should","will"));
System.out.println("User entered string is converted to Upper Case " + userinput.toUpperCase());
System.out.println("User entered string is converted to Lower Case " +userinput.toLowerCase());

System.out.println("User entered string is displaying after trimming the spaces from both ends " + userinput.trim());

String staticcomment="I have decided that ";

System.out.println(staticcomment.concat(userinput));
	}

}
