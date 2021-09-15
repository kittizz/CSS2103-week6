/**
 * ListNode
 */
public class ListNode {
    public int data;
    public ListNode next;

    public ListNode() {
    }

    ListNode(int data) {
        this.data = data;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args) {

        // Before
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        ListNode temp = new ListNode(4);
        temp.next = new ListNode(5);
        temp.next.next = new ListNode(6);

        // After
        ListNode after_list;
        after_list = temp.next;
        after_list.next = list.next.next;
        after_list.next.next = temp;
        after_list.next.next.next = list.next;
        after_list.next.next.next.next = null;

        System.out.println();
    }
}