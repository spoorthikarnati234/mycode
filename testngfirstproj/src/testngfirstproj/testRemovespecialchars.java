package testngfirstproj;

public class testRemovespecialchars {
	public String removechars(String s1) {
	String p="";
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)>=65 && s1.charAt(i)<=90)||(s1.charAt(i)>=97 && s1.charAt(i)<=122)||(s1.charAt(i)>=48 && s1.charAt(i)<=57)) {
			p+=s1.charAt(i);
		}
		}
		return p;
	}
	public String removechars1(String s2) {
		String p1="";
			p1=s2.replaceAll("[^a-zA-Z0-9]", "");
			return p1;
		}
		
public static void main(String args[]) {
	testRemovespecialchars td =new testRemovespecialchars();
	String s="5^#$#$%ajayjkj))@@dama";
	System.out.println(td.removechars(s));	
	System.out.println(td.removechars1(s));
	
}
}
