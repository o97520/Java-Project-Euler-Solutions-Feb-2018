import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long a = 2;
			long b = 8;
			long c = 0;
			long sum = 10;
			while (b < n) {
				sum += c;
				c = b * 4 + a;
				a = b;
				b = c;
			}
			System.out.println(sum);
		}
	}
}
