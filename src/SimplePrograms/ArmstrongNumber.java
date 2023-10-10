package SimplePrograms;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int result=0,temp=0;
System.out.println("Enter any number to verify whether it is Armstrong Number : ");
int userinput = in.nextInt();
int confirminput=userinput;

while(userinput>0) {
	result=userinput%10;
	userinput = userinput/10;
	temp=(result*result*result)+temp;
}

if(temp==confirminput)
{
	System.out.println(confirminput + " user entered number is Armstrong Number");
}
else {
	System.out.println(confirminput + " user entered number is NOT Armstrong Number");
}
	}

}
