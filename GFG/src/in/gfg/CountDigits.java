package in.gfg;

import java.util.Scanner;

/*Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly*/

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		
		System.out.println(divideEvenly(m));
		
		

	}

	private static int divideEvenly(int m) {
		int count=0;
		int num = m;
		
		while(m>0) {
			int rem = m%10;
			
			if(rem!= 0 && num%rem == 0) {
				count++;
			}
			m = m/10;
			
		}
		return count;
		
	}

}
