import java.util.Scanner;
import java.util.Arrays;
public class ReadNumbers {

   // Escrever os numeros guardados num array no stdout
   static void writeArray(int v[]) {
      for (int i=0; i<v.length; i++)
         System.out.println("v[" + i + "] = " + v[i]);
   }

   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      int n = stdin.nextInt();   // Ler a quantidade de numeros que se seguem
      int v[] = new int[n];     // Cria um novo array com espaço para n inteiros

      for (int i=0; i<n; i++)    // Ler os numeros a partir do stdin
         v[i] = stdin.nextInt();

      writeArray(v);             // Chamar procedimento que escreve
      amplitude(v,n);
   }
   static void amplitude(int a [], int n){
    // Scanner stdin = new Scanner(System.in); nao e necessario pq ja le na main e quando chega aqui ja nao tem nada para ler
    // int n = stdin.nextInt(); same here
    // Arrays.sort(a);
    int max = a [0], min = a [0];
    for(int i = 0; i < n; i++){
      if (a[i] < min) {
        min = a [i];
      }
      if (a[i] >  max){
        max = a [i];
      }
    }
     System.out.println(max - min);
   }
}
