import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	//treeset maintains order hashset doesn't
	Set<Integer> values=new TreeSet<>();
		values.add(92);
		values.add(86);
		values.add(53);
		values.add(45);
		values.add(71);
		values.add(6);
		for(int i:values) {
			System.out.println(i);
		}
}
}
