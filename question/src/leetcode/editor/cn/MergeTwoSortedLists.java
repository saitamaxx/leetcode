package leetcode.editor.cn;

public class MergeTwoSortedLists{
    public static void main(String[] args) {
       Solution solution = new MergeTwoSortedLists().new Solution();
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode vHead = new ListNode(0);
        ListNode p = vHead;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return vHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}