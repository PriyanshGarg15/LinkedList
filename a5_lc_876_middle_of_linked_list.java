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

//  class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow=head;;
//         ListNode fast=head;
//         while( fast!=null && fast.next!=null)
//         {
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
        
//     }
// }

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int size = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             size++;
//             temp = temp.next;
//         }
//         int middleIndex = (size/2)+1;
//         temp = head;
//         for (int i = 0; i <middleIndex-1; i++) {
//             temp = temp.next;
//         }
//         return temp;
//     }
// }
