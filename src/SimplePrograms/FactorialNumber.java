package SimplePrograms;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		int result=1;
System.out.println("Enter the number to get Factorial Number : ");
Scanner in = new Scanner(System.in);
int userinput = in.nextInt();

for(int i=1;i<=userinput;i++) {
	result=result*i;
}
System.out.println("Factorial number of "+userinput+" is "+result);
	}

}
