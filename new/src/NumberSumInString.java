import java.util.*;
public class NumberSumInString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string consisting numbers:");
		String st=sc.nextLine();
		int i,sum;
		sum=0;
		for(i=0;i<st.length();i++)
		{
				char a=st.charAt(i);
				if(Character.isDigit(a))
				{
					int num=Integer.parseInt(String.valueOf(a));
					sum+=num;
				}
			
		}
		System.out.println("sum of digits in a string is:"+sum);
	}
}
