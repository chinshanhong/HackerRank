// Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0) {
            head = head.next;
            return head;
        }
        SinglyLinkedListNode previous = head;
        for(int i = 1; i < position; i++){
            previous = previous.next;
        }
        SinglyLinkedListNode current = previous.next;
        previous.next = current.next;

        return head;
    }
