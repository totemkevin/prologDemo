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
		String tmp="";
		String t=range(input);
		if(t=="0")
		{
     		tmp+="機器人休息中...\n";
		}
		String t2 = "now("+t+",L).";
	    Query q2 = new Query(t2);
	    
	    
	    Map<String, Term> s4;
	    
	     while ( q2.hasMoreSolutions() ){
	    	s4= q2.nextSolution();
	    	
	        tmp+= "L = " + s4.get("L") +" \n";
	        switch(t)
		     {
		     	case "1":
		     		tmp+="主人現在是早餐時間，您需要";
		     		break;
		     	case "2":
		     		tmp+="主人早上好，您需要";
		     		break;
		     	case "3":
		     		tmp+="主人現在是午餐時間，您需要";
		     		break;
		     	case "4":
		     		tmp+="主人下午好，您需要";
		     		break;
		     	case "5":
		     		tmp+="主人現在是晚餐時間，您需要";
		     		break;
		     	case "6":
		     		tmp+="晚安主人，您需要";
		     		break; 
		     }
		     switch(s4.get("L")+"")
		     {
		     	case "chinesefood":
		     		tmp+="吃中式餐點嗎?\n";
		     		break;
		     	case "coffee":
		     		tmp+="喝杯咖啡嗎?\n";
		     		break;
		     	case "western":
		     		tmp+="吃西式餐點嗎?\n";
		     		break;
		     	case "watchtv":
		     		tmp+="看電視嗎?\n";
		     		break;
		    	 
		     }
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
		if(timeH>=0 && timeH<5)
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
