class ED194{
public static void reverse(MyStack<Integer> s, int n){
  int[] aux = new int[n];
  for(int i = 0; i < n; i++){
    aux[i] = s.pop();
    }
  for(int k = 0; k < n ; k++){
    s.push(aux[k]);
    }
  }
}
