package apiAutomation;

public class strngtoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "{\"result\":[{\"ApplicationID\":\"71468\",\"ApplicationNm\":\"*.acnms.com\"},{\"ApplicationID\":\"55186\",\"ApplicationNm\":\"*.nt.navitaire.com\"},{\"ApplicationID\":\"9340\",\"ApplicationNm\":\"12332 - Diagnostics Catalog\"},{\"ApplicationID\":\"193811\",\"ApplicationNm\":\"*.otslab.corp\"}]}";
		//System.out.println(str.trim());
		
		String str2= str.replace("result", "");
		//str2.
		//String str3= str2.replaceAll("[", "");
		//String str4=str3.replaceAll("]", "");
		//String str= str2.replaceFirst("{", "");
		//System.out.println(str2);
		String str_parts []= str2.split(",");
		
		for(int i=0;i<str_parts.length;i++) {
			System.out.println(str_parts[i]);
			/*
			 * String s1[]= str_parts[i].split("\""); for(int j=0;j<s1.length;j++) {
			 * System.out.println("Inner Loop: "+s1[i]); }
			 */
		}
		
		
	}

}
