package SwordToOffer;
/**
 * 
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 
 * 
 * @author Mr.X
 *
 */

public class colina010 {
	
	 public static int RectCover(int n) {

		 if (n <= 2) return n;
	        int a =1;
	        int b =2;
	        int c = 0;
	        for(int i=3;i<=n;i++){
	            c = a+b;
	            a = b;
	            b = c;
	        }
	        return c;
	    
	    }
	 
	 public static void main(String[] args) {
		 
		 System.out.println(RectCover(20));
	 }

}
