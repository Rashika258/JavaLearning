package youtube.learnings;

public class PackageDemo {
	//r is private package similar to default can be accessed within package
	int r;
	//to use i in some other package it has to be made public
	public int i;
	//only within package and also other package if it extends class from package in which protected is created
	protected int j;
	//only within class
	private int k;
}
