import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		List values=new ArrayList();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(1,2);
		values.add("hiii");
		
		System.out.println(values);
//		Iterator it=values.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//without using iterator
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
		for(Object o:values) {
			System.out.println(o);
		}
	}

}
