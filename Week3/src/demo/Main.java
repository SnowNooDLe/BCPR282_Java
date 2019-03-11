package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		double n1 = 1.1;
		double n2 = 2.2;
		double n3 = n1 + n2;
		System.out.println(n3);
		
		BigDecimal d1 = new BigDecimal("1.1");
		BigDecimal d2 = new BigDecimal("2.2");
		BigDecimal d3 = d1.add(d2);
		System.out.println(d3);
		
		Date today = new Date();
		System.out.println(today);
		
		int[] a1 = {11, 22, 33};
		int[] a3 = new int[4];
//		Array, once you set the limit of number of items for that array, you cannot change later, eg
//		int[] a3 = new int[4] meants array a3 can only store 4 no matter what so ever.
		
		for (int n : a1) {
			System.out.println(n);
		}
		
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.add(11);
		a5.add(15);
		for (int m : a5) {
			System.out.println(m);
		}
		
		int i = 2;
		assert i % 3 == 1 : i;
	}
}
