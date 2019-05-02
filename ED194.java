public class ED194{
	public static void reverse(MyStack<Integer> s, int n){
		int[] aux = new int[n];
		for(int i = 0; i < n; i++){
			aux[i] = s.pop();
		}
		for(int j = 0; j < n; j++){
			s.push(aux[j]);
		}
	}
}
