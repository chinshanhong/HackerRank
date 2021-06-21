class Solution
{

    public static Node removeDuplicates(Node head) {
      if(head == null){
          return head;
      }
      else{
          Node current = head;
          while(current != null){
              Node nextNode = current.next;
              if(nextNode != null && current.data == nextNode.data){
                  current.next = nextNode.next;
              }
              else{
                  current = current.next;
              }
          }
      }
      return head;

    }
