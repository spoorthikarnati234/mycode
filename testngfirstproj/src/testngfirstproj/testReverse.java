package testngfirstproj;

public class testReverse {
	public String reversefunc(String s1) {
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		return sb.toString();
	}
	public String reversefunc1(String s1) {
		String p="";
			for(int i=s1.length()-1;i>=0;i--) {
				p+=s1.charAt(i);
			}
			return p;
		}
public static void main(String args[]) {
	testReverse td =new testReverse();
	String s="ajaydama";
	System.out.println(td.reversefunc(s));
	System.out.println(td.reversefunc1(s));
}
}
