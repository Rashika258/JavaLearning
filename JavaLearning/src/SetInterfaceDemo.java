import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		Set<Integer> values=new HashSet<>();
 		System.out.println(values.add(5));
		values.add(9);
		System.out.println(values.add(5));//this won't be printed bcs set will have only unique values
		for(int i:values) {
			System.out.println(i);
		}
	}
}
