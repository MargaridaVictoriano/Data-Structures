//ED190
public SinglyLinkedList<T> copy(){
  SinglyLinkedList<T> outputList = new SinglyLinkedList<T>();
  Node<T> curr = first;
  if(isEmpty()){
    return outputList;
  }
  while(curr.getNext() != null){
    outputList.addLast(curr.getValue());
    curr = curr.getNext();
  }
  outputList.addLast(curr.getValue());
  return outputList;
}
