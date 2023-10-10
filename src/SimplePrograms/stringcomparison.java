package SimplePrograms;

public class stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Abhishek";
String str2="abhishek";

if(str1.equals(str2)) {
	System.out.println("Inside str1.equals(str2) if block");
}
else {
	System.out.println("Not Entered in str1.equals(str2) if block");
}
if(str1==str2) {
	System.out.println("Inside str1==str2 if block");
}
else {
	System.out.println("Not Entered in str1==str2 if block");
}
if(str1.compareTo(str2)==0) {
	System.out.println("Inside str1.compareTo(str2)");
}
else {
	System.out.println("Not Entered in str1.compareTo(str2)");
}
	}

}
