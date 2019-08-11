import java.util.HashMap;
import java.util.Map;


public class MapTest {
	
	public static void main(String[] args)
	{
		Map<String , String[] > sm = new HashMap<String, String[]>();
		String[] c=new String[3];
		String[] a=new String[3];
		String[] b=new String[3];
		
		a[0]= "Type of Amount 1"; a[1]="Currency 1"; a[2]="amount 1";
		String x="1";
		String y="2";
		String z="3";
		sm.put(x, a);
		b[0]="Type of Amount 2"; b[1]="Currency 2"; b[2]="amount 2";
		c[0]="Type of Amount 3"; c[1]="Currency 3"; c[2]="amount 3";
		sm.put(y, b);
		sm.put(z,c);
		StringBuffer d= new StringBuffer();
		 d.append(System.lineSeparator());
		 for(Map.Entry m:sm.entrySet()){  
			  // System.out.println(/*m.getKey());//+" "+*/m.getValue());  
			   String [] e = (String[]) m.getValue();			   
				d.append(e[0]);
				d.append("      ");
				d.append(e[1]);
				d.append(","+e[2]);
				d.append(System.lineSeparator());
			  } 
	System.out.println(d);
		
		
		
	}

}
