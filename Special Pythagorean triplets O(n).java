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
			int n = in.nextInt();
			int a = 0, c;
			int count = 0;
			int temp = 0;
			for (int b = 2; b < (n / 2); b++) {
				a = ((2 * n * b) - ((int) Math.pow(n, 2))) / ((-2 * n) + (2 * b));
				c = n - a - b;
				if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && (a + b + c) == n) {
					count++;
					if (temp < (a * b * c)) {
						temp = a * b * c;
					}
				}
			}
			if (count == 0) {
				System.out.println("-1");
			}else{
				System.out.println(temp);
			}
		}
	}
}
