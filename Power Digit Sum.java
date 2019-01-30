import java.io.*;
import java.util.Scanner;
import java.math.*;

class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = 0;
			int n = in.nextInt();
			BigInteger two = new BigInteger("2");
			BigInteger finale = two.pow(n);
			String x = finale.toString();
			int e = x.length();
			for (int j = 0; j < e; j++) {
				a += (x.charAt(j) - '0');
			}
			System.out.println(a);
		}
	}
}