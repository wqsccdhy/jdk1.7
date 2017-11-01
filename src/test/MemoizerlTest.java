package test;

import java.math.BigInteger;

public class MemoizerlTest {

	public static void main(String[] args) throws InterruptedException {
		Computable<String, BigInteger> c = new ExpensiveFunction();
		Memoizerl<String, BigInteger> memoizerl = new Memoizerl<String, BigInteger>(c);
		BigInteger compute = memoizerl.compute("100");
		System.out.println(compute);

	}

}
