package in.gfg;

import java.util.Scanner;

public class AlldivisorsofaNumber {
	static void print_divisors(int N) {
		int i = 0;
		for (i = 1; i * i < N; i++) {
			if (N % i == 0) {
				System.out.print(i + " ");
			}
		}

		if (i - (N / i) == 1) {

			i--;
		}

		for (; i >= 1; i--) {
			if (N % i == 0) {
				System.out.print((N / i) + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // for 30 20
		print_divisors(N);
	}
}