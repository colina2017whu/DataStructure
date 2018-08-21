package SwordToOffer;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * @author graph
 *
 */
public class colina008 {
	

	public static int JumpFloor(int n) {
        if (n <= 2) return n;
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i = 3;i <= n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
	
	public static void main(String[] args) {
		
		System.out.println(JumpFloor(4));
	}
}
