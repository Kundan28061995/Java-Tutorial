import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class dateparsing {
	public static void main(String args[]){
		SimpleDateFormat sfi = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat soi = new SimpleDateFormat("yyyy/mm/dd");
		Date date = new Date();
		try {
			System.out.println(date);
			date = sfi.parse("20/11/2016");
			String s = soi.format(date);
			System.out.println(date);
			System.out.println(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
