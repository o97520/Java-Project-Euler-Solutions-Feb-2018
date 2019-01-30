import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			long startTime = System.nanoTime();
			fib(n);
			long endTime   = System.nanoTime();
			long totalTime = endTime - startTime;
			System.out.println(totalTime);
			
		}
	}

	static void fib(int n) {
		BigInteger c = new BigInteger("0");
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");

		int returned = 1;
		while (String.valueOf(c).length() != n) {
			returned++;
			c = b.add(a);
			a = b;
			b = c;
		}
		System.out.println(returned);

	}
}