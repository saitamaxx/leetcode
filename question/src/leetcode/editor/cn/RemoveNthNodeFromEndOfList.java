package leetcode.editor.cn;

public class RemoveNthNodeFromEndOfList{
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
    }

//leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode x = findFromEnd(dummy, n + 1);
        x.next = x.next.next;
        return dummy.next;
    }

    ListNode findFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        int k = 1;
        while (p1 != null) {
            if (k > n) {
                p2 = p2.next;
            }
            p1 = p1.next;
            k++;
        }
        return p2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}