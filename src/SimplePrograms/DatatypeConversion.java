package SimplePrograms;

public class DatatypeConversion {

	public static void main(String[] args) {
		//Conversion of String to Integer
		String s ="200";
		int i = Integer.parseInt(s);
		Long l = Long.parseLong(s);
		float f = Float.parseFloat(s);
		double d=Double.parseDouble(s);
		
		System.out.println(s+200);
		System.out.println(i+200);
		System.out.println("");
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println("");

		//Conversion of Integer to String
		int temp=50;
		String stemp=String.valueOf(temp);
		System.out.println(stemp+100);
		System.out.println(temp+100);
	}

}
