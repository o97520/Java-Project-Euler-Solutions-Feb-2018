import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long x = 0, y = 0;
			long d = n * n;
			double a = ((double)d / 2);
			double b = ((double)n / 2);

			long c = (long) (a + b);
			x = c * c;

			a = d * n;
			b = d;
			y = ((2 * (long) a) + (3 * (long) b) + n) / 6;
			long result = (x - y);

			System.out.println(result);
		}
	}

}
