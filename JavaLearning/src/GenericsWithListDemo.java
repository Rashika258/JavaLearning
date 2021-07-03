import java.util.ArrayList;
import java.util.List;

public class GenericsWithListDemo {
	public static void main(String[] args) {
		//1.5
		List<Integer> values=new ArrayList<Integer>();
		//1.7
		List<Integer> value=new ArrayList<>();
		values.add(1);
		values.add(5);
		value.add(2);
		value.add(4);
		for(Integer o:values) {
			System.out.println(o);
		}
		for(Integer o:value) {
			System.out.println(o);
		}
		
	}

}
