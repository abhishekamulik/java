package SimplePrograms;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
Boolean isPrime=false;
System.out.println("Enter the number to check Prime Number :");
Scanner in = new Scanner (System.in);
int userinput=in.nextInt();

for(int i=2;i<userinput;i++) {
	if(userinput%i==0) 
		{
		isPrime=false;
		break;
		}
	else {
		isPrime=true;
		}
	}
if(isPrime==true)
{
	System.out.println(userinput +" number is Prime Number");
}
else
{
	System.out.println(userinput +" number is not Prime Number");
}
	}

}
