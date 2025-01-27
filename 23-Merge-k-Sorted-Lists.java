/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++)
        {
            while(lists[i] != null)
            {
                pq.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode result = new ListNode();
        ListNode temp = result;
        while(!pq.isEmpty())
        {
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return result.next;
    }    
}