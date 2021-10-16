package lecture_4;
import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=1,n;
		System.out.println("Enter the no of rows ");
		n =sc.nextInt();
		
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}
	}

}
