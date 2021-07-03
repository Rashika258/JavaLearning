class Calc {
	public int add(int ... n) { //...-> variable length parameters
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		return sum;
	}
}
public class VarArgsDemo{
	public static void main(String[] args) {
		Calc obj=new Calc();
		System.out.println(obj.add(4,5,6,7));
	}
}
