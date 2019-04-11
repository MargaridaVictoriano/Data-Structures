class Node<T>{
  //Atributes
  private T value;
  private Node<T> next;
  // constructor
  Node(T v, Node<T> n){
    value = v;
    next = n;
  }
  //Getters & Setters
  public Node<T> getNext(){
    return next;
  }
  public void setNext(Node <T> n){
    next = n;
  }
  public T getValue(){
    return value;
  }
  public void setValue(T v){
    value = v;
  }
}

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
    //ED188
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

    //ED189
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
//ED191
public void duplicate(){
  Node <T> curr = first;
  while(curr != null){
    curr.setNext(new Node<T>(curr.getValue(), curr.getNext()));
    curr = curr.getNext().getNext(); // o atual tem de saltar duas posiçoes para nao se voltar a repetir
  }
  size *= 2;
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
class TestSinglyLinkedList {
   public static void main(String[] args) {

      // Criacao de lista de inteiros
      SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

      // Escrevendo lista (no inicio esta vazia)
      System.out.println(list);

      // Verificando se esta vazia
      System.out.println("isEmpty? " + list.isEmpty());

      // Adicionando numeros de 1 a 5 ao final da lista
      for (int i=2; i<=10; i+=2)
         list.addLast(i);
      System.out.println(list);
      // Adicionando numeros de 6 a 10 ao inicio da lista
      /*for (int i=6; i<=10; i++)
         list.addFirst(i);
      System.out.println(list);
*/
      // Verificando o tamanho da lista
      /*
      System.out.println("size = " + list.size());

      // Retirando o primeiro elemento
      list.removeFirst();
      System.out.println(list);

      // Retirando o ultimo elemento
      list.removeLast();
      System.out.println(list);

      // Verificando se esta vazia
      System.out.println("isEmpty? " + list.isEmpty());

      // Escreve o primeiro e ultimo elementos
      System.out.println("getFirst() = " + list.getFirst());
      System.out.println("getLast() = " + list.getLast());
*/
      //list
      System.out.println("list: "+list);
      //get position
      for(int k = 0; k <= 10; k++){
        System.out.println("getpos: "+   list.get(k));
      }


   }
}
