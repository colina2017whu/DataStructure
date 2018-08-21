package SwordToOffer;

import java.util.*;

/**
 * 
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author Mr.X
 *
 */

	
	class ListNode{
		int val;
		  ListNode next = null;
		  
		  ListNode(int val) {
			  this.val = val;
		  }
	}
		 
		 public class colina003 {
			 
		    /**下面以试验成功
		     *  public void reverse(LinkNode headNode){
		         //用栈的思想来实现链表的倒序输出
		        Stack<LinkNode> stack=new Stack<LinkNode>();
		         while(headNode!=null){
		            stack.push(headNode);
		             headNode=headNode.next;
		        }
		         while(!stack.isEmpty()){
		             System.out.print(stack.pop().val+" ");
		         }
		        System.out.println();
		    }
		 

		     public static void main(String[] args) {
		        //输入的链表有多个结点
		        colina003 plr=new colina003();
		        
		        LinkNode node1 = new LinkNode();
		        LinkNode node2 = new LinkNode();
		        LinkNode node3 = new LinkNode();
		        
		        node1.val = 12;
		        node2.val = 78;
		        node3.val = 99;
		        node1.next = node2;
		        node2.next = node3;
		         plr.reverse(node1);
		     }
		     */
			 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
			        ArrayList<Integer> arr = new ArrayList<Integer>();
			        ListNode p = listNode;
			        ArrayList<Integer> stack = new ArrayList<Integer>();
			        while(p != null){
			            stack.add(p.val);
			            p = p.next;
			        }
			        int n = stack.size();
			        for(int i = n-1;i >= 0;i--){
			            arr.add(stack.get(i));
			        }
			        return arr;
			        
			    }
			 
			 public static void main(String args[]) {
				 colina003 plr = new colina003();
				 
				 ListNode node1 = new ListNode(1);
				 ListNode node2 = new ListNode(2);
				 ListNode node3 = new ListNode(3);
				 
				 node1.next = node2;
				 node2.next = node3;
				 
				 //plr.printListFromTailToHead(node1);
				 
				 System.out.println(plr.printListFromTailToHead(node1));
			 }

			 
		 
		 }


