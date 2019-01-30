import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int z = 0; z < t; z++) {
			int n = in.nextInt();

			int sumdivA = 0;
			int sumdivB = 0;
			int FinalSum = 0;
			for (int i = 1; i < n; i++) {
				sumdivA = 0;
				sumdivB = 0;
				for (int j = 1; j <= i / 2; j++) {
					if (i % j == 0) {
						sumdivA += j;
					}
				}
				// System.out.println("The Sum of Divisors of " +i + "-A is : "
				// +sumdivA);
				if (sumdivA != i) {
					for (int j = 1; j <= sumdivA/2; j++) {
						if (sumdivA % j == 0) {
							sumdivB += j;
						}
					}
				}
				// System.out.println("The Sum of Divisors of " +i + "-B is : "
				// +sumdivB);
				if (i == sumdivB) {
					FinalSum += i;
					//System.out.println(FinalSum);

				}

			}
			System.out.println(FinalSum);
		}
	}

}