import java.util.Scanner;
public class Calculator {
  //segments to draw the numbers
  static void Segments(char[][] Matrix, char x, int y) {
    boolean seg0=false, seg1=false, seg2=false, seg3=false, seg4=false, seg5=false, seg6=false;
    char ch ='#';
    if(x=='0'){
      seg0=true;
      seg1=true;
      seg2=true;
      seg3=true;
      seg4=true;
      seg5=true;
    }
    if(x=='1'){
      seg1=true;
      seg2=true;
    }
    if(x=='2'){
      seg0=true;
      seg1=true;
      seg6=true;
      seg4=true;
      seg3=true;
    }
    if(x=='3'){
      seg0=true;
      seg1=true;
      seg2=true;
      seg3=true;
      seg6=true;
    }
    if(x=='4'){
      seg1=true;
      seg2=true;
      seg5=true;
      seg6=true;
    }
    if(x=='5'){
      seg0=true;
      seg2=true;
      seg3=true;
      seg5=true;
      seg6=true;
    }
    if(x=='6'){
      seg0=true;
      seg2=true;
      seg3=true;
      seg4=true;
      seg5=true;
      seg6=true;
    }
    if(x=='7'){
      seg0=true;
      seg1=true;
      seg2=true;
      seg5=true;
    }
    if(x=='8'){
      seg0=true;
      seg1=true;
      seg2=true;
      seg3=true;
      seg4=true;
      seg5=true;
      seg6=true;
    }
    if(x=='9'){
      seg0=true;
      seg1=true;
      seg2=true;
      seg3=true;
      seg5=true;
      seg6=true;
    }
    if(seg0==true){
    Matrix[0][1+y]= ch;
    Matrix[0][2+y]= ch;
    }
    if(seg1==true){
    Matrix[1][3+y]=ch;
    Matrix[2][3+y]=ch;
    }
    if(seg2==true){
    Matrix[4][3+y]=ch;
    Matrix[5][3+y]=ch;
    }
    if(seg3==true){
    Matrix[6][1+y]=ch;
    Matrix[6][2+y]=ch;
    }
    if(seg4==true){
    Matrix[4][0+y]=ch;
    Matrix[5][0+y]=ch;
    }
    if(seg5==true){
    Matrix[1][0+y]=ch;
    Matrix[2][0+y]=ch;
    }
    if(seg6==true){
    Matrix[3][1+y]=ch;
    Matrix[3][2+y]=ch;
    }
}
  //add dot
  static void dot(char[][] Matrix,int Lines,int Columns){
     for(int l=0; l<Lines; l++) {
       for(int c=0; c<Columns; c++) {
         Matrix[l][c]='.'; 
       }
     }
   }
   //separate the algarisms drawn by spaces
   static void space(char[][] Matrix,int Lines,int Columns){
     for(int c=4; c<Columns; c+=5) {
       for(int l=0; l<Lines; l++)
         Matrix[l][c]=' ';
       }
   }
   //print matrix
   static void printMatrix(char[][] Matrix,int Lines,int Length){
     for(int l=0; l<Lines; l++) {
       for(int c=0; c<((Length*5)-1); c++) { //print until the final digit
         System.out.print(Matrix[l][c]);
       }
       System.out.println();
     }
   }
   static void Display(int n) {
    String str = Integer.toString(n);
    int j = str.length();
    int Lines=7;
    int Columns=35;
    char[][] Matrix = new char [Lines][Columns];
    int p=0;
    dot(Matrix, Lines, Columns);
    space(Matrix, Lines, Columns);
    for(int i=0; i<j; i++) {
      Segments(Matrix, str.charAt(i), p);
      p += 5;
    }
    printMatrix(Matrix,Lines,j);
  }
   public static void main(String[] args) {
      System.out.print("Number to print: ");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      Display(number);
  }
}