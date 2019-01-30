import java.io.;
import java.util.;
import java.text.;
import java.math.;
import java.util.regex.;
import java.math.BigInteger;
import java.math.BigInteger;
import java.math.BigInteger;
import java.math.BigInteger;

public class soly3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0 ; i  t ; i ++){
		int n = in.nextInt();
		int m = in.nextInt();
		int l = m + n;
		BigInteger lfact = new BigInteger(factorial(l));
		BigInteger nfact = new BigInteger(factorial(n));
		BigInteger mfact = new BigInteger(factorial(m));
		
		
		BigInteger Required = lfact.divide(nfact).divide(mfact).mod((BigInteger.valueOf(1000000007)));
		System.out.println(Required);
		}
	}

	public static String factorial(int n) {
		BigInteger fact = new BigInteger(1);
		for (int i = 1; i = n; i++) {
			fact = fact.multiply(new BigInteger(i + ));
		}
		return fact.toString();
	}
}