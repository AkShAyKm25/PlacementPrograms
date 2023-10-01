/*A number is given in Decimal Write a code for convert Binary.
Input : 32
Output : 100000
Input : 120
Output : 1111000*/
package Git;

import java.util.Scanner;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		while(n!=0) {
			int b=n%2;
			s=b+s;
			n/=2;
		}
		System.out.println(s);
		sc.close();
	}
}


