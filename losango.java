import java.util.Scanner;
public class losango{
  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    int size = stdin.nextInt();
    int i, j;
    int x = size/2;
    int y = size - (size-1);
    //metade do losango incluindo meio so com #
    for(i = 0; i <= size/2; i++){
      for(j = 0; j < x; j++)
        System.out.print(".");
      for(j = 0; j < y; j++)
        System.out.print("#");
      for(j = 0; j < x; j++)
        System.out.print(".");
      x--;
      y+=2;

      System.out.println("");
    }
    x = size -2;
    y = size -(size - 1);
    //resto do losango
    for(i = 0; i < size/2; i++){
      for(j = 0; j < y; j++)
        System.out.print(".");
      for(j = 0; j < x; j++)
        System.out.print("#");
      for(j = 0; j < y; j++)
        System.out.print(".");
      x -= 2;
      y++;

      System.out.println("");
    }

  }
}
