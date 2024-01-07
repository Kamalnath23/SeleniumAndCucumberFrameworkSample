package apiAutomation;

import java.util.HashMap;
import java.util.Map;

public class dem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//return hashMap2;
	}

}
