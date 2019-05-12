public class TestMyQueue {
  class LinkedListQueue<T> implements MyQueue<T> {
    private DoublyLinkedList<T> list;

    LinkedListQueue() { list = new DoublyLinkedList<T>();}

    public void enqueue(T v) { list.addLast(v); }
    public T dequeue() {
       T ans = list.getFirst();
       list.removeFirst();
       return ans;
    }
    public T first() { return list.getFirst();}
    public int size() {return list.size();}
    public boolean isEmpty() {return list.isEmpty();}

    public String toString() {return list.toString();}
 }

   public static void main(String[] args) {

      // Criacao da fila
      MyQueue<Integer> q = new LinkedListQueue<Integer>();

      // Exemplo de insercao de elementos na fila
      for (int i=1; i<=8; i++)
         q.enqueue(i); // insere i no final da fila
      System.out.println(q);

      // Exemplo de remocao de elementos da fila
      for (int i=0; i<4; i++) {
         int aux = q.dequeue(); // retira o elemento no inicio da fila
         System.out.println("q.dequeue() = " + aux);
      }
      System.out.println(q);

      // Exemplo de utilizacao dos outros metodos
      System.out.println("q.size() = " + q.size());
      System.out.println("q.isEmpty() = " + q.isEmpty());
      System.out.println("q.first() = " + q.first());
   }
}
