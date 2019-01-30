import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int result = 0;

		for (int a0 = 0; a0 < t; a0++) {
			for (int j = 0; j < t; j++)
				;
			{
				result = 0;
				int n = in.nextInt();
				String x = factorial(n).toString();
				int e = x.length();
				for (int i = 0; i < e; i++) {
					result += x.charAt(i) - '0';
				}
			}
			System.out.println(result);
		}
	}

	public static BigInteger factorial(int number) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = number; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}