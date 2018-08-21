package SwordToOffer;
/**
 * 
 * 给定一个double类型的浮点数base
 * 
 * 和int类型的整数exponent。
 * 
 * 求base的exponent次方。
 * 
 * @author Mr.X
 *
 */

public class colina012 {
	   
	public static double Power(double base, int exponent) {
		double count = base;
		
		if(exponent > 0) {
	     for(int i = exponent; i > 1; i-- ) {
	        base = count * base;
	       }
	        return base;
	   }
	
		if(exponent == 0) return 1;
		
		else {
			exponent = -exponent;
			 for(int i = exponent; i > 1; i-- ) {
			        base = count * base;
			       }
			 base = 1/base;
			        return base;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(Power(4.0, 4));
	}

}
