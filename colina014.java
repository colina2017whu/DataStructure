package SwordToOffer;
/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author Mr.X
 *
 */

public class colina014 {
	
	class ListNode{
		int val;
		  ListNode next = null;
		  
		  ListNode(int val) {
			  this.val = val;
		  }
	}
	
	/**
	 * 指针解法
	 * （最优解）两个指针，先让第一个指针和第二个指针都指向头结点，
	 * 然后再让第一个指正走(k-1)步，到达第k个节点。
	 * 然后两个指针同时往后移动，
	 * 当第一个结点到达末尾的时候，
	 * 第二个结点所在位置就是倒数第k个节点了。
	 * public class Solution {
    public ListNode FindKthToTail(ListNode list,int k){
     if(list == null || k < 0)
         return null;
     ListNode fristNode = list;
     ListNode lastNode = list;
     for (int i = 1; i < k; i++) {
         fristNode = fristNode.next;
     }
     while(fristNode != null){
         fristNode = fristNode.next;
         lastNode = lastNode.next;
     }
     return lastNode;
    }
}
	 *
	 */
    
    public ListNode FindKthToTail(ListNode head,int k) {

    	if(head == null)
    		return null;
    	ListNode listnode = head;
    	int count = 0;
    	
    	while(listnode != null) {
    		count++;
    		listnode = listnode.next;
    	}
    	if(count < k)
    		return null;
    	
    	ListNode listnode1 = head;
    	
    	for(int i = 0; i < count - k; i++) {
    		listnode1 = listnode1.next;
    	}
    	return listnode1;
    }
    
 

}
