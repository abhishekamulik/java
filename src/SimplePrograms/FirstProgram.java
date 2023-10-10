package SimplePrograms;
import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
int num1,result=0;
Scanner scanin = new Scanner(System.in);
num1=scanin.nextInt();

result=num1%10;
System.out.println(result);
	}

}
