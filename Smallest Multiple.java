import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            int result = calculations(n);
            System.out.println(result);
        }
    }

	private static int calculations(int n) {
		int result = n;
		outermostloop:
		while(true){

			outerloop:
			for(int i = 1 ; i <= n ; i ++){
				if(result % i != 0){
					break outerloop;
				}
				if(i == n){
					break outermostloop;
				}
			}
			result++;
		}
		return result;
	}
}
