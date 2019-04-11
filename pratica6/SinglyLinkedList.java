class SinglyLinkedList<T>{
  //Atributes
  private Node<T> first;
  private int size;
  //Construtor
  SinglyLinkedList(){
    first = null;
    size = 0;
  }
  //Methods
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if(size == 0){
      return true;
    }
    return false;
  }
  public void addFirst(T v){
    Node<T> n = new Node<T>(v,first);
    first = n;
    size++;
  }
  public void addLast(T v){
    Node<T> n = new Node<T>(v,null);
    if(isEmpty()){
      first = n;
    }
    else{
      Node<T> curr = first;
      while(curr.getNext() != null){
        curr = curr.getNext();
      }
         curr.setNext(n);
    }
    size++;
  }
  public T getFirst(){
    if(isEmpty()){
      return null;
    }
    return first.getValue();
  }
  public T getLast(){
    Node<T> curr = first;
    while(curr.getNext() != null){
      curr = curr.getNext();
    }
    return curr.getValue();
  }
  public void removeFirst(){
    if(isEmpty()){
      return;
    }
    else{
      first = first.getNext();
    }
    size--;
  }
  public void removeLast(){
    if(isEmpty()){
      return;
    }
    if(size == 1){
      first = null;
    }
    else{
      Node<T> curr = first;
      for(int i = 0; i < size - 2; i++){
        curr = curr.getNext();
      }
      curr.setNext(curr.getNext().getNext());
    }
    size--;
  }

  //ED192
  public int count(T value){
    int counter = 0;
    Node <T> curr = first;
    while(curr != null){
      if(curr.getValue().equals(value)){
        counter++;
      }
      curr = curr.getNext();
    }
    return counter;
  }
  //ED193
  public T remove(int pos){
  Node<T> curr = first;
  if(pos >= size || pos < 0) {
    return null;
    }
  for (int i=0; i < pos; i++) {
    curr = curr.getNext();
    }
  T removedV= curr.getValue();
  //curr fica o proximo
  for (int i = pos; i < size-1; i++) {
    curr.setValue(curr.getNext().getValue());
    curr = curr.getNext();
    }
  removeLast();
  return removedV;
    }
    public T get(int pos){
      Node<T> curr = first;
      if((pos < 0) || (pos >= size)){
        return null;
      }
      else{
        for(int i = 0; i < pos ; i++){
          curr = curr.getNext();
        }
        return curr.getValue();
      }
    }
    public void removeAll(T value){
      int i = 0;
      while(get(i) != null){
        if(get(i).equals(value)){
          remove(i);
        }
        else{
          i++;
        }
      }
    }

//toString
  public String toString(){
    String ret = "{";
    Node<T> curr = first;
    while(curr != null){
      ret += curr.getValue();
      curr = curr.getNext();
      if(curr != null){
        ret += ",";
      }
    }
    ret += "}";
    return ret;
  }
}
