package SwordToOffer;
/**
 * 
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author hdfs
 *
 */
/**
 * 
 *  public static ListNode ReverseList(ListNode head) {
        //pre始终指向已反序的最后一个节点
        ListNode pre = null;
        //middle始终指向正在考察节点
        ListNode middle = head;
        //after始终指向待反序的第一个节点，也就是middle之后
        ListNode after = null;
        while(middle != null) {
            //更新after
            after = middle.next;
            //对考察的节点进行反序
            middle.next = pre;
            //更新pre
            pre = middle;
            //后移middle, 换下一个待考察节点
            middle = after;
        }
        //因为pre始终指向已反序的最后的一个节点
        return pre;
    }
 *
 */

public class colina015 {
	
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}

	public ListNode ReverseList(ListNode head) {

		if(head == null || head.next == null)
			return head;
		
		ListNode reverseHead = ReverseList(head.next);
		head.next.next = head;
		head.next = null;
		return reverseHead;
		
    }
}
