public static Node removeDuplicates(Node head) {

  Node current = head;
  String temp = head.data + "" ;

  if (current.next != null) {
    while(current.next.next != null){
      if(temp.indexOf(String.valueOf(current.next.data) ) == -1){
        temp = temp + current.next.data;
        current = current.next;
      }
      else{
        current.next = current.next.next;

      }
    }

    if(current.data == current.next.data && current.next.next == null)
    {
      current.next = null;
    }
  }

  return head;
}
