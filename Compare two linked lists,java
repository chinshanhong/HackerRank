static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        // int counter 
        // while(head1 != null || head2 != null){
        //     if((head1.data) != (head2.data)) return false;
        //     head1 = head1.next;
        //     head2 = head2.next;
        // }
        // return true;
        int counter1 = 0, counter2 = 0;
        while(true){
            if(head1 != null) counter1++;
            else break;
            if(head2 != null) counter2++;
            else break;
            if(head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return counter1 == counter2;

    }
