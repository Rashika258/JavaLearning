import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;
import com.phone.Windows;

public class FactoryMain {
	 public static void main(String[] args) {
		OS obj=new Android();
		obj.spec();
		OS obj1=new IOS();
		obj1.spec();
		OS obj2=new Windows();
		obj2.spec();
		
	}
}
