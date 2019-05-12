class ED196{
  public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
    String aux;
    while(!q.isEmpty()){
      aux = q.dequeue();
      if(q.first().equals("A")){
        a.enqueue(aux);
      }
      else if(q.first().equals("B")){
        b.enqueue(aux);
      }
      else if(q.first().equals("X")){
        if(a.size() < b.size()){
          a.enqueue(aux);
        }
        else if(b.size() < a.size()){
          b.enqueue(aux);
        }
      }
      q.dequeue();
    }

  }
}
