import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceDemo {
		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			System.out.println("enter number");
			BufferedReader br=null;
			int n=0;
			try{
				br=new BufferedReader(new InputStreamReader(System.in));
				n=Integer.parseInt(br.readLine());
				//instead of closing resource in try block , close it always in final block
				//br.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
			finally {
				System.out.println("Final block");
				br.close();
			}
			//only run time exceptions are unchecked and all compiler errors are checked by default and throws declaration are added
			System.out.println(n);
		}
	}


