class Casio {
	int num1, num2;
	String op;
	public Casio() {
		num1=num2=0;
		op="nothing";
	}
public Casio(int i) {
		num1=i;
		num2=0;
		op="nothing";
	}
public Casio(int i, int j) {
	num1=i;
	num2=j;
	op="Nothing";
}
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Casio obj=new Casio();
		obj.add(1, 2);
		obj.add(4, 3,5);
	}
}
