//ED191
public void duplicate(){
  Node <T> curr = first;
  while(curr != null){
    curr.setNext(new Node<T>(curr.getValue(), curr.getNext()));
    curr = curr.getNext().getNext(); // o atual tem de saltar duas posiçoes para nao se voltar a repetir
  }
  size *= 2;
}
