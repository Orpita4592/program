package strings;
import java.util.*;
public class count {
	public static void countno(String str) {
	int l=str.length();int c=1,i;
	for(i=0;i<l;i++) {
		char ch=str.charAt(i);
		if(ch==' ') 
			 c=c+1;
	}
		System.out.println("word count  " +c);
		
	}

	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter a sentence");
		s=sc.nextLine();
		countno(s);
	}
}




