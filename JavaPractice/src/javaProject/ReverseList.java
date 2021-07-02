package javaProject;

import java.util.LinkedList;

public class ReverseList {
	public static void main(String args[]) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		System.out.println(l1);
		
		LinkedList<Integer> ll1=new LinkedList<>();
		
		l1.descendingIterator().forEachRemaining(ll1::add);
		
		System.out.println(ll1);
		
		
	}
}
