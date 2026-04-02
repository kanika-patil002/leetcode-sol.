/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode ha, ListNode hb) {
        //i will go for iteration either get value for intersection and null for no intersection 
        if(ha == null || hb == null)return null;
        ListNode a = ha;
        ListNode b = hb;
        while(a != b){
            if(a == null){a= hb;
            }else{a =a.next; }
            if(b == null){b = ha;
            }
            else{b =b.next;}
        }
        return a;
    }
}