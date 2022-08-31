package leetcode.editor.cn;

public class PartitionList{
    public static void main(String[] args) {
        Solution solution = new PartitionList().new Solution();
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
    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode smallDummy = new ListNode(-1);
        ListNode bigDummy = new ListNode(-1);
        ListNode p1 = smallDummy;
        ListNode p2 = bigDummy;
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1 = p1.next;
            } else {
                p2.next = p;
                p2 = p2.next;
            }
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        p1.next = bigDummy.next;
        return smallDummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}