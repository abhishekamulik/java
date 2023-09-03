package SimplePrograms;
import java.util.*;
public class CollectionLinkedList {

	public static void main(String[] args) {
LinkedList<String> ll = new LinkedList<String>();
ll.add("Mango");
ll.add("Banana");
ll.add("Grapes");
ll.add("Watermelon");
ll.add("Pineapple");

Iterator itr = ll.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
