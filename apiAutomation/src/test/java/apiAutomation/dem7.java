package apiAutomation;

import java.util.HashMap;
import java.util.Map;

public class dem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hashMap1
        = new HashMap<String, String>();

		
		String AppIDobj=null;
		String AppIDval=null;
		
		String AppNmobj=null;
		String AppNmval=null;
		
		String s = "{\"result\":[{\"ApplicationID\":\"71468\",\"ApplicationNm\":\"*.acnms.com\"},{\"ApplicationID\":\"55186\",\"ApplicationNm\":\"*.nt.navitaire.com\"},{\"ApplicationID\":\"9340\",\"ApplicationNm\":\"12332 - Diagnostics Catalog\"},{\"ApplicationID\":\"193811\",\"ApplicationNm\":\"*.otslab.corp\"}]}";

		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.replace(s.length() - 2, s.length(), "");
		sb.replace(0, 11, "");
		System.out.println(sb);

		String s2 = sb.toString();

		String sa[] = s2.split(",");
		String s3 = null;
		String s4 = null;
		
		/*
		 * for(int i=0;i<sa.length;i++) { System.out.println(sa[i]); }
		 */

		for (int i = 0; i < sa.length; i++) {
			// System.out.println(sa[i]);

			StringBuilder sb2 = new StringBuilder();
			sb2.append(sa[i]);
			if (i % 2 == 0) {
				sb2.replace(0, 1, "");
				// System.out.println(sb2.toString());
				s3 = sb2.toString();
				// System.out.println(s3);
				String parts[] = s3.split(":");
				for (int j = 0; j < parts.length; j++) {
					StringBuilder sb3 = new StringBuilder();
					sb3.append(parts[j]);
					sb3.replace(parts[j].length() - 1, parts[j].length(), "");
					sb3.replace(0, 1, "");
					if(j%2==0) {
						AppIDobj=sb3.toString();
						//System.out.println("ID Object : "+AppIDobj);
						//hashMap1.put(AppIDobj, AppIDval);
						//System.out.println(hashMap1);
						
					}else if(j%2!=0) {
						AppIDval=sb3.toString();
						//System.out.println("ID Value : "+AppIDval);
						//hashMap1.put(AppIDobj, AppIDval);
						//System.out.println(hashMap1);
					}
					hashMap1.put(AppIDobj, AppIDval);
					
					
				}

				// Print hashMap
				// System.out.println("String to HashMap: " + hashMap);

			} else if (i % 2 != 0) {
				sb2.replace(sa[i].length() - 1, sa[i].length(), "");
				// System.out.println(sb2.toString());
				s3 = sb2.toString();
				//System.out.println(s3);
				String parts[] = s3.split(":");
				for (int j = 0; j < parts.length; j++) {
					StringBuilder sb3 = new StringBuilder();
					sb3.append(parts[j]);
					sb3.replace(parts[j].length() - 1, parts[j].length(), "");
					sb3.replace(0, 1, "");
					if(j%2==0) {
						AppNmobj=sb3.toString();
						//System.out.println("Nm Object : "+AppNmobj);
						//hashMap1.put(AppNmobj, AppNmval);
						//System.out.println(hashMap1);
					}else if(j%2!=0) {
						AppNmval=sb3.toString();
						//System.out.println("Nm Value : "+AppNmval);
						//hashMap1.put(AppNmobj, AppNmval);
						//System.out.println(hashMap1);
					}
					hashMap1.put(AppNmobj, AppNmval);
					//hashMap1.put(AppIDobj, AppIDval);
				}
			// System.out.println(sb2.toString());

		}
			System.out.println(hashMap1);
	}
		
	}

}
