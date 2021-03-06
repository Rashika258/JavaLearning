import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("enter number");
		int n=0;
		try(BufferedReader br=new BufferedReader
				(
					new InputStreamReader(System.in)
				)
			){
			n=Integer.parseInt(br.readLine());
			//instead of closing resource in try block , close it always in final block
			//br.close();
		}

		//only run time exceptions are unchecked and all compiler errors are checked by default and throws declaration are added
		System.out.println(n);
	}

}
