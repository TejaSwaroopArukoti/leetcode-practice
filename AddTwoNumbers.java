
class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;

        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;

        while( p1 != null || p2 != null) {
            int num1 = p1!= null ? p1.val : 0;
            int num2 = p2!= null ? p2.val : 0;
            int sum = num1 + num2 + carry;
            currentNode.next = new ListNode( sum % 10);
            currentNode = currentNode.next;
            carry = sum / 10;
            p1 = p1.next;
            p2 = p2.next;
        }
        return dummyNode.next;

    }
    public static void main(String[] args) {
       ListNode node1 = new ListNode(1);
       node1.next = new ListNode(2);
       node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(1);
       node2.next = new ListNode(2);
       node2.next.next = new ListNode(3);

       ListNode result = new AddTwoNumbers().addTwoNumbers(node1, node2);
       printListNode(result);
    }

    public static void printListNode(ListNode ln) {
        ListNode current = ln;
        while(current!=null) {
            System.out.print(current.val);
            current = current.next;
        }
        System.out.println();
    }
  
}
 