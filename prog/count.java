package strings;

public class count {
	public static void countno(String str) {
	int l=str.length();int c=0;
	for(int i=0;i<l;i++) {
		char ch=str.charAt(i);
		if(ch==' ') {
			 c=c+1;
	}}
		int w=c+1;
		System.out.println("word cunt  " +w);
		
	}

	public static void main(String args[]) {
	
	String str="i am a good girl";
	countno(str);
	
	
	
	
	
}}




