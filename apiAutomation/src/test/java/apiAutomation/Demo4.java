package apiAutomation;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d = new Demo4();
		d.getAPIresults();
		d.sn();
		
		
		Demo4 sn= new Demo4();
		sn.sn();
		
		
	}
	
	public Map<String, String> getAPIresults() {
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
		//System.out.println(sb);

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
						hashMap1.put(AppIDobj, AppIDval);
						System.out.println(hashMap1);
						
					}else if(j%2!=0) {
						AppIDval=sb3.toString();
						//System.out.println("ID Value : "+AppIDval);
						hashMap1.put(AppIDobj, AppIDval);
						System.out.println(hashMap1);
					}
					//hashMap1.put(AppIDobj, AppIDval);
					
					
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
						hashMap1.put(AppIDobj, AppIDval);
						System.out.println(hashMap1);
					}else if(j%2!=0) {
						AppNmval=sb3.toString();
						//System.out.println("Nm Value : "+AppNmval);
						hashMap1.put(AppIDobj, AppIDval);
						System.out.println(hashMap1);
					}
					//hashMap1.put(AppIDobj, AppIDval);
				}
			// System.out.println(sb2.toString());

		}
	
	}
		System.out.println(hashMap1);
		return hashMap1;
		

}
	public Map<String, String> sn() {
		Map<String, String> hashMap2
        = new HashMap<String, String>();
		String AppIDobj="ApplicationID";
		String AppIDval=null;
		
		String AppNmobj="ApplicationNm";
		String AppNmval=null;
		
		String ownedApp="*.acnms.com, *.nt.navitaire.com, 12332 - Diagnostics Catalog, *.otslab.corp";
		String OwnedAppId="71468,55186,9340,193811";
		
		String parts[]= OwnedAppId.split(",");
		for(int k=0;k<parts.length;k++) {
			AppIDval=parts[k];
			//System.out.println(AppIDval);
			hashMap2.put(AppIDobj, AppIDval);
		}
		
		String parts2[]= ownedApp.split(",");
		for(int m=0;m<parts2.length;m++) {
			AppNmval=parts2[m].trim();
			//System.out.println(AppNmval);
			hashMap2.put(AppNmobj, AppNmval);
		}
		//System.out.println(hashMap2);
		System.out.println("SECOND HASHMAP");
		System.out.println(hashMap2);
		return hashMap2;
	}

}
