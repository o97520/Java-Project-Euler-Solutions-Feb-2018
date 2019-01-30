import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int sum = 0;
		boolean a, b;
		//sum all natural numbers less than n that are palindromic in both number systems
		for(int i = 1 ; i < n ; i ++){
			String output = convert(i, k);
			String I = String.valueOf(i);
			a = isPalindromic(I);
			b = isPalindromic(output);
			if(a == true && b == true){
//				System.out.println(I + " & " + output + " Are Palindromic Pairs My Nigga");
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

	private static boolean isPalindromic(String output) {
		int length = output.length();
		int a = length/2;
		for(int i = 0 ; i < a; i ++){
			if(  output.charAt(i)-'0'  !=   output.charAt(length-i-1)-'0'){
				return false;
			}
		}
		
		return true;		
		
	}

	private static String convert(int a, int k) {
		String equiv = "";
		while(true){
			equiv = equiv.concat(String.valueOf(a%k));
			a = (int)a/k;
			if(a==0){
				return equiv;
			}
		}
	}
}
