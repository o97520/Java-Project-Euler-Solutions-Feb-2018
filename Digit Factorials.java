import java.io.*;
import java.util.*;

public class soly3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int finale = 0;
		for (int i = 10; i < n; i++) {
			finale += Divisible(i);
		}
		System.out.println(finale);
	}

	private static int Divisible(int a) {
		String x = String.valueOf(a);
		int result = 0;
		for (int i = 0; i < x.length(); i++) {
			result += factorial(x.charAt(i) - '0');
		}
		if (result % a == 0) {
			return a;
		} else {
			return 0;
		}
	}

	private static int factorial(int a) {
		if(a == 0){
			return 1;
		}
		int b = a;
		int c = a;
		for (int i = 1; i < a; i++) {
			b *= (c - 1);
			c -= 1;
		}
		return b;
	}
}