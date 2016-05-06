package com.test;
import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class MainClass {
	public static void main(String[] arggs) {
		Scanner sc = new Scanner(System.in);
		ArrayList<int []> list = new ArrayList();
		int i = 0;
		int count = 0;
		while (sc.hasNextLine()) {
			if (i == 0) {
				count = sc.nextInt();
				i++;
				sc.nextLine();
				continue;
			}
			String line = sc.nextLine();
			Scanner line_sc = new Scanner(line);
			int[] arr = new int[3];
			int j = 0;
			while (line_sc.hasNextInt()) {
				arr[j] = line_sc.nextInt();
				j++;
			}
			list.add(arr);
			if (i >= count) {
				break;
			}
			i++;
		}

		for (i = 0; i < count; i++) {
			int[] arr = list.get(i);
			int a = arr[0];
			int b = arr[1];
			int n = arr[2];
			int val = a;
			for (int j = 0; j < n; j++) {
				val += (int)Math.pow(2, j) * b;
				System.out.print(val);
				System.out.print(" ");
			}
			System.out.print('\n');
		}
	}
}
