//IS-A HAS-A

class Calculator{//super class
	public int add(int i, int j) {
		return i+j;
	}
}

//java -super, sub oops-parent child c++-base, derived
class CalcAdv extends Calculator{ //inheritance sub class
	public int sub(int i, int j) {
		return i-j;
	}
}
class CalcVeryAdv extends CalcAdv{
	public int mul(int i, int j) {
		return i*j;
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		//Calculator c1=new Calculator();
		//CalcAdv c2=new CalcAdv();
		CalcVeryAdv c2=new CalcVeryAdv();
		int res=c2.add(1, 2);
		int dif=c2.sub(9,2);
		int mul=c2.mul(5,4);
		System.out.println(res+"\t"+dif+"\t"+mul);
	}
}
