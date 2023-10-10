package SimplePrograms;
import java.util.*;
public class CollectionHashSet {

	public static void main(String[] args) {
HashSet<String> hs = new HashSet<String>();
hs.add("Cricket");
hs.add("Football");
hs.add("Hockey");
hs.add("Volleyball");
hs.add("Basketball");
Iterator itr=hs.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());

}

	}

}
