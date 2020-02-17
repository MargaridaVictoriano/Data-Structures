public class Numbers {
    public static void main(String[] args) {
	int n = 500; // limite dos numeros
	int soma = 0;
	System.out.println("Numeros de 1 a " + n + ":"); // + é o operador de concatenação de strings
	for (int i=1; i<=n; i++){
		soma += i;
	    System.out.println(i);
	}
	System.out.println("Soma = " + soma);
    }

}