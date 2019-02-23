import java.util.Scanner;

public class Palindromos {

  public static void main(String[] args){

    Scanner stdin = new Scanner(System.in);

    int N  = stdin.nextInt();
    System.out.println(N);
    stdin.nextLine();




    for(int i = 1; i <= N; i++ ){
      String s = stdin.nextLine(); // get the N strings
      s = s.replaceAll("[^a-zA-Z]","");
      s = s.toLowerCase();
      String copia = "";
      for(int x = s.length() - 1; x >= 0; x--){
        copia += s.charAt(x);
      }
      if(copia.equals(s)){
        System.out.println("sim");
      }
      else{
        System.out.println("nao");
      }
    }
  }

}
