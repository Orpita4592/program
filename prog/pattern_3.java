package lecture_4;

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=1,n;
		System.out.println("Enter the no of rows ");
		n =sc.nextInt();
		
		while(i<=n) {
			int j=1;
			while(j<=n) {
				
				System.out.print(+j);//for printing just 1111 and then2222 just put 'i' instead of  j.
				j++;
				
			}
			System.out.println();
			i++;
	}

	}

}
