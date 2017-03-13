package tutorials.test;

/**
 * Created by Sergey on 2/14/2016.
 */
public class testNodes02 {
    public static void main(String[] args) {


        // Create list A
        Node aList = null;
        aList.data = 1;
        aList = aList.next;
        aList.data = 5;
        aList = aList.next;
        aList.data = 7;
        aList = aList.next;
        aList.data = 9;

        // Create list B
        Node bList = null;
        bList.data = 2;
        bList = bList.next;
        bList.data = 3;
        bList = bList.next;
        bList.data = 4;
        bList = bList.next;
        bList.data = 8;

        // Merge Lists
        Node newList = MergeLists(aList, bList);
        while (newList != null)
        {
            System.out.println(newList.data);
            newList = newList.next;
        }


    }

    static Node MergeLists(Node headA, Node headB) {

        Node head = headA;

        while (headA != null && headB != null) {

            if (headA.data < headB.data) {
                headA = headA.next;

            }
            if (headB.data < headA.data) {
                Node tmp = headA;
                headA = headB;
                headB = headB.next;
                headA.next = tmp;
                headA = headA.next.next;
                System.out.println(headA.data);


            }

        }

        return head;
    }

}




class Node {
    int data;
    Node next;
}
