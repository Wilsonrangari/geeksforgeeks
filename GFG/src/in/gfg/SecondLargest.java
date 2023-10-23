package in.gfg;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(print2largest(arr, n));
		sc.close();

	}

	static int print2largest(int arr[], int n) {

		int largest = -1;
		int secondLargest = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}

		}
		return secondLargest;

	}

}
