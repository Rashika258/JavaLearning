
public class ArrayDemo {
	public static void main(String[] args) {
		int nums[]=new int[4];
		for(int i=0;i<4;i++) {
			nums[i]=i;
		}
		for(int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
//		System.out.println(nums[4]);
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]= {5,6,7};
		int d[][]= {a,b,c	}; //jagged arrays
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++)
				System.out.println(d[i][j]);
}
}
