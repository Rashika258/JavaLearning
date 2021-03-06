import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collection-interface --> so it needs other classes for implementation of methods defned in it
//collection-concept
//Collections-framework
public class CollectionDemo {
	//1.8 <Integer> used on both sides is removed
	public static void main(String[] args) {
		//colln doesn't have index values
		Collection values=new ArrayList();
		values.add(1);
		values.add(2);
		values.add(3);
		System.out.println(values);
	//	System.out.println(values[0]);
//		Iterator used to traverse a collection because it doesn't have index value
		Iterator it=values.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		//since collection doesn't have index elements can't be added at random
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
