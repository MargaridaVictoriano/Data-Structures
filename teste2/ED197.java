class ED197{
  public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
    MyQueue<Integer> union = new LinkedListQueue<Integer>();
    while(!a.isEmpty() && !b.isEmpty()){
      if(a.first() <= b.first()){
        union.enqueue(a.first());
        a.dequeue();
      }
      else if(a.first() > b.first()){
        union.enqueue(b.first());
        b.dequeue();
      }
    }
    if(!a.isEmpty()){
      while(!a.isEmpty()){
      union.enqueue(a.first());
      a.dequeue();
      }
    }
    if(!b.isEmpty()){
      while(!b.isEmpty()){
        union.enqueue(b.first());
        b.dequeue();
      }
    }
    return union;
  }
}
