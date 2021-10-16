package lecture_4;

import java.util.Scanner;

public class char_pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=1,n;
		System.out.println("Enter the no of rows ");
		n =sc.nextInt();
		
		while(i<=n) {
			int j=1; char t=(char)('A'+i-1);
			while(j<=n) {
				
				System.out.print(t);
				j++;
				t=(char)(t+1);//while working with char everywhere we should be carefully do type castiing 
				
			} 
			
			System.out.println();
			i++;

	}
	}}

