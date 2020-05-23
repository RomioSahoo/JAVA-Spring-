//string pattern:ACD1234W
import java.util.*;
public class StringMatching {
	private static void getvalue(String st) {
		// TODO Auto-generated method stub
		if(st.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))  
		{
			System.out.println("matched");
		}
		else
			System.out.println("not matched");
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String st=sc.nextLine();
		getvalue(st);
	}

	
}