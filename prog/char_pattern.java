package lecture_4;

import java.util.Scanner;

public class char_pattern {

	public static void main(String[] args) {
		
	
			Scanner sc= new Scanner(System.in);
			int i=1,n;
			System.out.println("Enter the no of rows ");
			n =sc.nextInt();
			
			while(i<=n) {
				int j=1; 
				while(j<=n) {
					
					System.out.print((char)('A'+j-1));//sirf a+j karnae sae bcde,bcde print hota
					j++;                                //isiliyae sirf ek aagae janae kae liyae -1 kiyae tab sahi print honae laga
					
				} 
				
				System.out.println();
				i++;
		}
	}

}
