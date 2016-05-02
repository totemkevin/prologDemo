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
	    
	    String linkMsg =q1.hasSolution() ? "�s�����\" : "�s������";
	    
	    return linkMsg;
	}
	
	public static String run(int input)
	{
		String tmp="";
		String t=range(input);
		if(t=="0")
		{
     		tmp+="�����H�𮧤�...\n";
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
		     		tmp+="�D�H�{�b�O���\�ɶ��A�z�ݭn";
		     		break;
		     	case "2":
		     		tmp+="�D�H���W�n�A�z�ݭn";
		     		break;
		     	case "3":
		     		tmp+="�D�H�{�b�O���\�ɶ��A�z�ݭn";
		     		break;
		     	case "4":
		     		tmp+="�D�H�U�Ȧn�A�z�ݭn";
		     		break;
		     	case "5":
		     		tmp+="�D�H�{�b�O���\�ɶ��A�z�ݭn";
		     		break;
		     	case "6":
		     		tmp+="�ߦw�D�H�A�z�ݭn";
		     		break; 
		     }
		     switch(s4.get("L")+"")
		     {
		     	case "chinesefood":
		     		tmp+="�Y�����\�I��?\n";
		     		break;
		     	case "coffee":
		     		tmp+="�ܪM�@�ض�?\n";
		     		break;
		     	case "western":
		     		tmp+="�Y�覡�\�I��?\n";
		     		break;
		     	case "watchtv":
		     		tmp+="�ݹq����?\n";
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
