package SwordToOffer;

/**
 * 
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 
 * 队列中的元素为int类型
 * 
 * @author Mr.X
 *
 */

import java.util.Stack;

public class colina005 {
	 	Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {	
	    	int temp;
	    	while(!stack1.empty()) {
	    		temp = stack1.pop();
	    		stack2.push(temp);
	    	}
	    	
	    	int res = stack2.pop();
	    	while(!stack2.empty()) {
	    		temp = stack2.pop();
	    		stack1.push(temp);
	    	}
	    	
	    	return res;
	    }
}
