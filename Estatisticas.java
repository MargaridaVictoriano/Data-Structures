import java.util.Scanner;
public class Estatisticas {
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
    int size = stdin.nextInt();
    int v[] = new int[size];
    for(int i = 0; i < size; i++)
      v[i] = stdin.nextInt();
    Media(v,size);
    amplitude(v,size);
  }
  static void Media(int v[], int size){
    int sum = 0;
    for(int i = 0; i < size; i++){
      sum += v[i];
    }
    double media = sum / size;
    System.out.printf("%.2f\n", media);
  }
  static void amplitude(int v [], int size){
   int max = v [0], min = v [0];
   for(int i = 0; i < size; i++){
     if (v[i] < min) {
       min = v [i];
     }
     if (v[i] >  max){
       max = v [i];
     }
   }
    System.out.println(max - min);
  }
}
