import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date");
		String st=sc.nextLine();
		getDate(st);
		
	}

	private static void getDate(String st) {
		// TODO Auto-generated method stub
		if(st.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			try {
				java.util.Date d1=sdf.parse(st);
				System.out.println("Valid date");
				System.out.println(d1);
			}
			catch(ParseException pe)
			{
				pe.getStackTrace();
				System.out.println("not valid date");
			}
		}
		
	}

}
