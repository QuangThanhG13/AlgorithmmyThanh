package baicodethieunhi;

// Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
   //Dùng đệ quy để làm :
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            ListNode next_1 = l1.next;
            ListNode newNext = mergeTwoLists(next_1, l2);
            l1.next = newNext;
            return l1;
        } else {
            ListNode next_2 = l2.next;
            ListNode newNext2 = mergeTwoLists(l1, next_2);// chuyền đúng parmeter vào không thì nó sẽ không hiểu
            l2.next = newNext2;
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;

        ListNode m1 = new ListNode(2);
        ListNode m2 = new ListNode(4);
        ListNode m3 = new ListNode(6);
        m1.next = m2;
        m2.next = m3;

        printLnkedList(n1);
        printLnkedList(m1);

        ListNode newList = mergeTwoLists(n1, m1);
        printLnkedList(newList);


    }

    public static void printLnkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}



// *Cách 1 :
//    private static void printList(ListNode head) {
//        ListNode current = head;
//        while (current != null) {
//            System.out.print(current.val + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//}

// * Cách 1 :
// public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode(-1); // Dummy node to start the result list
//        ListNode current = dummy; // Pointer to the current node in the result list
//
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                current.next = list1;
//                list1 = list1.next;
//            } else {
//                current.next = list2;
//                list2 = list2.next;
//            }
//            current = current.next;
//        }
//
//        // Attach the remaining nodes from the non-empty list, if any
//        if (list1 != null) {
//            current.next = list1;
//        } else {
//            current.next = list2;
//        }
//
//        return dummy.next; // Skip the dummy node to get the actual head of the merged list
//    }


//    * Cách 2 :
//            public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//                if (list1 != null && list2 != null) {
//                    if (list1.val < list2.val) {
//                        list1.next = mergeTwoLists(list1.next, list2);
//                        return list1;
//                    } else {
//                        list2.next = mergeTwoLists(list1, list2.next);
//                        return list2;
//                    }
//                }
//                if (list1 == null)
//                    return list2;
//                return list1;
//
//            }



