package in.gfg;
import java.util.Scanner;

public class LargestElementinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(largestElement(arr, n));

	}

	private static int largestElement(int[] arr, int n) {
		int largest = arr[0];
		for (int i = 0; i < n; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}

		}

		return largest;
	}

}
