//package LinkedList;
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// *
// *
// *
// *
// *
// * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
// *
// * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
// *
// * Do not modify the linked list.
// *
// *
// *
// * Example 1:
// *
// *
// * Input: head = [3,2,0,-4], pos = 1
// * Output: tail connects to node index 1
// * Explanation: There is a cycle in the linked list, where tail connects to the second node.
// * Example 2:
// *
// *
// * Input: head = [1,2], pos = 0
// * Output: tail connects to node index 0
// * Explanation: There is a cycle in the linked list, where tail connects to the first node.
// * Example 3:
// *
// *
// * Input: head = [1], pos = -1
// * Output: no cycle
// * Explanation: There is no cycle in the linked list.
// *
// *
// * Constraints:
// *
// * The number of the nodes in the list is in the range [0, 104].
// * -105 <= Node.val <= 105
// * pos is -1 or a valid index in the linked-list.
// */
//
//public class LinkedListCycle2 {
//    public ListNode detectCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return null;
//        }
//
//        ListNode slow = head;
//        ListNode fast = head;
//        boolean hasCycle = false;
//
//        // Phase 1: Determine if a cycle exists
//        while (fast != null && fast.next != null) {
//            slow = slow.next;          // Move 1 step
//            fast = fast.next.next;     // Move 2 steps
//
//            if (slow == fast) {        // They met! Cycle detected.
//                hasCycle = true;
//                break;
//            }
//        }
//
//        // If no cycle was found, return null
//        if (!hasCycle) {
//            return null;
//        }
//
//        // Phase 2: Find the entry point of the cycle
//        slow = head; // Reset slow to head
//
//        // Move both 1 step at a time. Where they meet is the start of the cycle.
//        while (slow != fast) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        return slow;
//    }
//}
