/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        boolean result = false;

        while(s!=null && f!=null ){
            s=s.next;
            if(f.next==null){
                f=null;
            }
            else{
                f=f.next.next;
            }
            if(f!=null && s==f){
                result=true;
                break;
            }
        }

        return result;
    }
}