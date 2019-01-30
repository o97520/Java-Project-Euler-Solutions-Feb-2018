import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		for (long i = 0; i < t; i++) {
			long n = in.nextLong();
			long a = 0, b = 0, d = 0;
			a = (n - 1) / 3;
			b = (n - 1) / 5;
			d = (n - 1) / 15;
			long c = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * d * (d + 1) / 2;
			System.out.println(c);
		}
	}
}