package Java.Leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LC142 {

    public static ListNode detectCycle(ListNode head) {
        ListNode turtle = head;
        ListNode rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;

            if (rabbit == turtle) {
                // start of cycle
                turtle = head;
                while (turtle != rabbit) {  // reset turtle
                    turtle = turtle.next;
                    rabbit = rabbit.next;
                }
                return turtle;  // cycle start node
            }
        }

        return null; // no cycle detected
    }

    public static void main(String[] args) {
        // Example: 3 -> 2 -> 0 -> -4 -> back to 2
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next = new ListNode(-4);
        head.next.next.next = head.next; // cycle back to node with value 2

        // Call detectCycle directly since it's static
        ListNode cycleStart = detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
