import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class soly3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		BigInteger Q = BigInteger.valueOf(0);
		for (int i = 0; i < n; i++) {
			Q = Q.add(in.nextBigInteger());
		}
		String x = Q.toString();
		for(int i = 0 ; i < 10 ; i ++){
		System.out.print(x.charAt(i));
		}
	}
}