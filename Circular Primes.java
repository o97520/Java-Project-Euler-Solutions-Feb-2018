import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197, 199, 311, 337, 373, 719, 733,
				919, 971, 991, 1193, 1931, 3119, 3779, 7793, 7937, 9311, 9377, 11939, 19391, 19937, 37199, 39119, 71993,
				91193, 93719, 93911, 99371, 193939, 199933, 319993, 331999, 391939, 393919, 919393, 933199, 939193,
				939391, 993319, 999331 };
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] > n) {
				break;
			}
			sum += primes[i];
		}
		System.out.println(sum);
	}
}