import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {
public static void main(String[] args) {
	//List is mutable by deafult
	List<Integer> value=new ArrayList<>();
	//to sort elements based on last digit in units place
	value.add(10);
	value.add(2);
	value.add(4);
	value.add(1);
	//to sort in ascending order by default
	Collections.sort(value);
	//to print in reverse order reverse it
	Collections.reverse(value);
	Collections.shuffle(value);
	for(Integer o:value) {
		System.out.println(o);
	}
	
}
}
