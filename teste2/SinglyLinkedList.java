public class SinglyLinkedList<T> {
   private Node<T> first;    // Primeiro no da lista
   private int size;         // Tamanho da lista

   // Construtor (cria lista vazia)
   SinglyLinkedList() {
      first = null;
      size = 0;
   }

   // Retorna o tamanho da lista
   public int size() {
      return size;
   }

   // Devolve true se a lista estiver vazia ou falso caso contrario
   public boolean isEmpty() {
      return (size == 0);
   }

   // Adiciona v ao inicio da lista
   public void addFirst(T v) {
      Node<T> newNode = new Node<T>(v, first);
      first = newNode;
      size++;
   }

   // Adiciona v ao final da lista
   public void addLast(T v) {
      Node<T> newNode = new Node<T>(v, null);
      if (isEmpty()) {
         first = newNode;
      } else {
         Node<T> cur = first;
         while (cur.getNext() != null)
            cur = cur.getNext();
         cur.setNext(newNode);
      }
      size++;
   }

   // Retorna o primeiro valor da lista (ou null se a lista for vazia)
   public T getFirst() {
      if (isEmpty()) return null;
      return first.getValue();
   }

   // Retorna o ultimo valor da lista (ou null se a lista for vazia)
   public T getLast() {
      if (isEmpty()) return null;
      Node<T> cur = first;
      while (cur.getNext() != null)
         cur = cur.getNext();
      return cur.getValue();
   }

   // Remove o primeiro elemento da lista (se for vazia nao faz nada)
   public void removeFirst() {
      if (isEmpty()) return;
      first = first.getNext();
      size--;
   }

   // Remove o ultimo elemento da lista (se for vazia nao faz nada)
   public void removeLast() {
      if (isEmpty()) return;
      if (size == 1) {
         first = null;
      } else {
         // Ciclo com for e uso de de size para mostrar alternativa ao while
         Node<T> cur = first;
         for (int i=0; i<size-2; i++)
            cur = cur.getNext();
         cur.setNext(cur.getNext().getNext());
      }
      size--;
   }
   //ED188
   public T get(int pos){
     Node<T> curr = first;
     if(pos < 0 || pos >= size){
       return null;
   }
    for(int i = 0; i < pos; i++){
      curr = curr.getNext();
    }
    return curr.getValue();
  }
  //ED189

  public T remove(int pos){
    Node<T> curr = first;
    if(pos < 0 || pos >= size){
      return null;
    }
    for(int i = 0; i < pos; i++){
      curr = curr.getNext();
    }
    T removedValue  = curr.getValue();
    for(int i = pos; i < size - 1; i++){
      curr.setValue(curr.getNext().getValue());
      curr = curr.getNext();
    }
      removeLast();
      return removedValue;

  }
  //ED190

  public SinglyLinkedList<T> copy(){
    SinglyLinkedList<T> copylist = new SinglyLinkedList<T>();
    Node<T> curr = first;
    if(isEmpty()){
      return copylist;
    }
    while(curr.getNext() != null){
      copylist.addLast(curr.getValue());
      curr = curr.getNext();
    }
    copylist.addLast(curr.getValue());
    return copylist;

  }
  //ED191

  public void duplicate(){
    Node<T> curr = first;
    while(curr != null){
      curr.setNext(new Node<T>(curr.getValue(), curr.getNext()));
      //o atual tem de saltar duas posiçoes para nao se repetir
      curr = curr.getNext().getNext();
    }
    size *= 2;
  }
  //ED192
  public int count(T value){
    int counter = 0;
    Node<T> curr = first;
    while(curr != null){
      if(curr.getValue().equals(value)){
        counter++;
      }
      curr = curr.getNext();
    }
    return counter;
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
   // Converte a lista para uma String
   public String toString() {
      String str = "{";
      Node<T> cur = first;
      while (cur != null) {
         str += cur.getValue();
         cur = cur.getNext();
         if (cur != null) str += ",";
      }
      str += "}";
      return str;
   }
}
