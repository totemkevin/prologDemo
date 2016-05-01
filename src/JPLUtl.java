import java.util.Map;
import java.util.Set;

import org.jpl7.Query;
import org.jpl7.Term;
import java.util.Date;
import java.text.SimpleDateFormat;

public class JPLUtl {
	public static String link()
	{
		String t1 = "consult('hw1.pl')";
	    Query q1 = new Query(t1);
	    
	    String linkMsg =q1.hasSolution() ? "連結成功" : "連結失敗";
	    
	    return linkMsg;
	}
	
	public static String run(int input)
	{
		String t=range(input);
		
		String t2 = "now("+t+",L).";
	    Query q2 = new Query(t2);
	    
	    String tmp="";
	    
	     while ( q2.hasMoreSolutions() ){
	    	Map<String, Term> s4= q2.nextSolution();
	    	Set <String> s = s4.keySet();
	    	
	        tmp+= "L = " + s4.get("L") +" ";
	     }
	     return tmp;
	}
	public static String time()
	{
		SimpleDateFormat sdFormat = new SimpleDateFormat("H:mm");
		Date date = new Date();
		String strDate = sdFormat.format(date);
		//System.out.println(strDate);
		return strDate;
	}
	public static String range(int timeH)
	{
		if(timeH>0 && timeH<5)
			return "0";
		else if(timeH>=5 && timeH<8)
			return "1";
		else if(timeH>=8 && timeH<11)
			return "2";
		else if(timeH>=11 && timeH<13)
			return "3";
		else if(timeH>=13 && timeH<17)
			return "4";
		else if(timeH>=17 && timeH<19)
			return "5";
		else if(timeH>=19 && timeH<23)
			return "6";
		else if(timeH==23)
			return "0";
		return "";
	}
}
