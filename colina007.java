package SwordToOffer;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项。
 *	n<=39
 * 
 * @author Mr.X
 *
 */

public class colina007 {
	public static int Fibonacci(int n) {
		
		if(n < 0 || n > 39) {
			return 0;
		}
		
		if(n == 0) {
			return 0;
		}
		
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int f1 = 0;
		int f2 = 1;
		int fn = 0;
		for(int i = 2; i <= n; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
		
		
	}
	
	public static void main(String args[]) {
		System.out.println(Fibonacci(10));
	}
}
