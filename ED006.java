import java.util.Scanner;

class ED006{
  public static void main(String args[]){
    Scanner stdin = new Scanner(System.in);
    int ncases = stdin.nextInt();
    for(int i = 0; i < ncases; i++){
      String trap = stdin.next();
      String frase = stdin.nextLine();
      String[] frase_parts = frase.split(" ");
      int frase_length = frase_parts.length;
      String nomes = stdin.nextLine();
      String[] nomes_parts = nomes.split(" ");
      CircularLinkedList<String> people = new CircularLinkedList<String>();
      for(int j = 1; j < nomes_parts.length; j++){
        people.addLast(nomes_parts[j]);
      }
      while(people.size() > 1){
        for(int k = 0; k < frase_parts.length; k++){
          people.rotate();
        }
        people.removeFirst();
      }
      if(people.getFirst().equals("Carlos"))
				System.out.println("O Carlos nao se livrou");
			else
				System.out.println("O Carlos livrou-se (coitado do " + people.getFirst() + "!)");
      }
  }
}
