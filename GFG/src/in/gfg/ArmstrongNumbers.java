package in.gfg;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(armstrongNumber(n));

	}

	private static String armstrongNumber(int n) {
		int sum =0;
		int ans = n;
		while (n > 0) {
			int rem = n%10;
			sum = (int) (sum + Math.pow(rem, 3));
			n = n/10;
			

		}
		if(sum == ans) {
			return "Yes" ;
		}
		else {
			return "No";
		}
		

	}

}
