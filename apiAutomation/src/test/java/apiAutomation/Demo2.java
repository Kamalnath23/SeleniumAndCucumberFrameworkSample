package apiAutomation;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Map<String, String> hashMap= new HashMap<String, String>();
		String s= "{\"result\":[{\"ApplicationID\":\"71468\",\"ApplicationNm\":\"*.acnms.com\"},{\"ApplicationID\":\"55186\",\"ApplicationNm\":\"*.nt.navitaire.com\"},{\"ApplicationID\":\"9340\",\"ApplicationNm\":\"12332 - Diagnostics Catalog\"},{\"ApplicationID\":\"193811\",\"ApplicationNm\":\"*.otslab.corp\"}]}";
		
		StringBuilder sb= new StringBuilder();
		sb.append(s);
		sb.replace(s.length()-2, s.length(), "");
		sb.replace(0, 11, "");
		System.out.println(sb);
		
		String s2= sb.toString();
		
		String sa[]= s2.split(",");
		String s3;
		/*
		for(int i=0;i<sa.length;i++) {
			System.out.println(sa[i]);
		}
		*/
		
		for(int i=0;i<sa.length;i++) {
			//System.out.println(sa[i]);
			
			StringBuilder sb2= new StringBuilder();
			sb2.append(sa[i]);
			if(i%2==0) {
				sb2.replace(0, 1, "");
				System.out.println(sb2.toString());
				s3=sb2.toString();
				 //String parts[] = s3.split(":");
				// for(int j-0;j)
			  
			        // Print hashMap
			        //System.out.println("String to HashMap: " + hashMap);
				 
			}else if(i%2!=0) {
				sb2.replace(sa[i].length()-1, sa[i].length(), "");
				System.out.println(sb2.toString());
				s3=sb2.toString();
			}
			//System.out.println(sb2.toString());
			
		}
		
	
	}
	
	

}
