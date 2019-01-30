import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		for (int i = 2; i < 1000000; i++) {
			String a = String.valueOf(i);
			int sum = 0;
			for(int j = 0 ; j < a.length(); j ++){
				sum += Math.pow((double)Integer.parseInt(String.valueOf(a.charAt(j))), n);
//				System.out.println(a.charAt(j) + " to the power of " + n);
//				System.out.println(sum);
			}
			if(sum == i){
				result += i;
			}
		}
		System.out.println(result);
	}
}