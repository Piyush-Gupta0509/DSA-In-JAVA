package LinkedList;

public class LinkedListCycle2 {
	//----Floyd Cycle Detection Algorithm---------
//	public class Solution {
//	    public ListNode detectCycle(ListNode head) {
//	        ListNode slow=head;
//	        ListNode fast=head;
//	        while(fast!=null && fast.next!=null){
//	            slow=slow.next;
//	            fast=fast.next.next;
//	            if(slow==fast){
//	                break;
//	            }
//	        }
//	        if(fast==null || fast.next==null){
//	            return null;
//	        }
//	        
//	        ListNode temp=head;
//	        while(temp!=fast){
//	            temp=temp.next;
//	            fast=fast.next;
//	        }
//	        
//	        return temp;
//	    }
//	}
}
