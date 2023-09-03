package SimplePrograms;
import java.util.*;
public class CollectionArrayList {

	public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>();
al.add("Abhishek");
al.add("Pushkraj");
al.add("Mahesh");
al.add("Siddharaj");
System.out.println(al.get(2));

System.out.println("");
System.out.println(al.size());

System.out.println("");
System.out.println(al.isEmpty());

System.out.println("");
System.out.println(al.contains("Abhishek"));
System.out.println(al.indexOf("Siddharaj"));

Iterator itr=al.iterator();
while(itr.hasNext())
		{
	System.out.println(itr.next());
		}
	}

}
