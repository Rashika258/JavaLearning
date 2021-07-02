package javaProject;

import java.util.ArrayList;
import java.util.List;

public class OddNo {
	public static boolean onlyOddNumbers(List<Integer> list) {
		for(int i:list) {
			if(i%2==0)
				return false;
		}
		return true;
	}
	
	public static boolean onlyOddNumb(List<Integer> list) {
		return list.parallelStream().anyMatch(x->x%2 != 0);
	}
	
	public static void main(String args[]) {
		List<Integer> l1 = new ArrayList<Integer>();
//		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(0,2);
		l1.add(1,3);
		l1.add(2,4);
		System.out.println(l1);
		System.out.println(onlyOddNumbers(l1));
		System.out.println(onlyOddNumb(l1));
	}
	
	
}
