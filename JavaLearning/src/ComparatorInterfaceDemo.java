import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceDemo {
	public static void main(String[] args) {
		List<Integer> value=new ArrayList<>();
		value.add(100);
		value.add(2032);
		value.add(456);
		value.add(178);
		//comparator is an interface by itself
		//No other class implements comparator
		//So to create object of comparator and use its methods overide the methods by creating user defined class else use anonymouos class
		Comparator <Integer>c=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(01%10> o2%10)
				return 1;
				else
				return -1;
			}
			
		};
		Collections.sort(value, c); //c is comparator object
		for(Integer o:value) {
			System.out.println(o);
		}
	}
}
