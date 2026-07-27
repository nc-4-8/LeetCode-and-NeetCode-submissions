class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode iter = new ListNode(0);
        ListNode solution = iter;
        int next = 0; 
        int x;
        int y;
        int sum;
        while(l1 != null || l2 != null){
            if(l1 != null){
                x = l1.val;
            }
            else{
                x = 0;
            }
             if(l2 != null){
                y = l2.val;
            }
            else{
                y = 0;
            }
            sum = next + x + y;
            next = sum/10;
            solution.next = new ListNode(sum % 10);
            solution = solution.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(next > 0){
            solution.next = new ListNode(next);
        }
        return iter.next;
        

    }
}