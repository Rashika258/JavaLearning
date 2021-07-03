
public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		//normal for loop
		System.out.println("normal for loop");
		for(int i=0;i<4;i++)
			System.out.println(a[i]);
		System.out.println("Enhanced for loop-similar to for each");
		for(int k:a)
			System.out.println(k);
	}

}
