package strings;

import java.util.Scanner;
public class another_way_palindrome {
	
	public static boolean check(String str) {
		int l= str.length();
		String str1="";
		for(int j=l-1;j>=0;j--){
			str1=str1+str.charAt(j);
		}
		for(int j=0;j<l;j++) {
			if(str1.charAt(j)!=str.charAt(j)) {
				return false;
				
			}
		}return true;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String tstr=sc.nextLine();
			System.out.println(check(tstr));
		}
		
		
	}

