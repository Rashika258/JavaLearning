//Java doesn't have access specifiers it has only access modifiers
/*1.Final
 * 2.Abstract
 * 3.Private
 * 4.Public
 * 5.Protected
 * class can be final, public,abstract but can't be private and protected
 * 
 * private-specific class
 * default-specific package
 * public-any class or package
 * protected-subsiding class
 */
import youtube.learnings.PackageDemo;
public class AccessModifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageDemo obj=new PackageDemo();
		obj.i=8;
	}

}
