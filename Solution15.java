public static  Node insert(Node head,int data) {

  if(head == null){
    Node node = new Node(data);
    return node;
  }
  else{
    Node currentNode = head ;
    while(currentNode.next != null){
      currentNode = currentNode.next;
    }
    Node newNode = new Node(data);
    currentNode.next = newNode;
    return head;
  }


}
