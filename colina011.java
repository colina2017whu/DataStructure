package SwordToOffer;

import java.util.Scanner;

/**
 * 
 * 输入一个整数，输出该数二进制表示中1的个数。
 * 
 * 其中负数用补码表示。
 * 
 * 
 * @author Mr.X
 *
 */

public class colina011 {

	public static void main(String[] args){
		System.out.println(Numberofl(-3));
    } 
	
	public static int Numberofl(int n) {
		
		/*if(n >= 0) {
			int count = 0;  
	        while (n != 0) {  
	            count++;  
	            n = n & (n - 1);  
	  
	        }  
	        return count;  			
		}
		
		else {
			int r = 0;
			n = -n;			
			int sum = 0;  
			int i = 0;
			 int[] a =new int[10];
			 
			do{            
	            if(n%2 == 1){
	                r = 1;
	            }
	            else {
	               r = 0;
	           }
	           a[i] = r;
	            n = n/2;
	            i++;
	        }
	        while(n > 0);
	           for (int j = i-1; j>=0; j--) {
	               if(a[j] == 0) //a[j] = 0;
	               //if(a[j] == 0) a[j] = 1;
	            	   sum ++;
	           }
	           
	           for(int j = 0; j <= i -1; j ++) {
	        	   if(a[j] == 0) {
	        		    sum = sum - j + 2;   
	        	   }
	        	   break;
	           }
	           
	           return sum;
	        } 
		}
		*/
		int count = 0;
		while(n != 0) {
			n = (n - 1) & n;
			count ++;
		}
		return count;
	}
		
		
	    
      
		
	
}
