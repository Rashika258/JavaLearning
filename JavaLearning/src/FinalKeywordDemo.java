class A{
	final int Day; //constant value can't be changed once it is initialised 
	final int B=10;//B can't be changed after this
	public A() {
		Day=20;//Day can't be changed after this
	}
	
}
public class FinalKeywordDemo {
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.Day);
	}
}
