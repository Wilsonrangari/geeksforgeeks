package in.gfg;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> table = getTable(n);
		System.out.println(table);
		

	}
	
	static ArrayList<Integer> getTable(int N){
		
		ArrayList<Integer> table = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			table.add(N*i);
		}
		return table;
	}

}
