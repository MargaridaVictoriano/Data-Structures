public class Sieve {

    // Procedimento para usar o algoritmo do Crivo de Eratóstenes
    // [procedimento ainda por completar]
    public static void sieve(int n, boolean prime[]) {
    	for(int i = 0; i < n; i++){
    		prime[i] = true;
    	}
    	for(int p = 2; p*p <= 2; p++){
    		if (prime[p] == true)
    			for(int i = p * 2; i<= n; i+=p){
    				prime[i] = false;
    			}
    	}
    }

    public static void main(String[] args) {
	
	int n=100000; // Limite dos números

	// Cria um array de inteiros com tamanho n+1
	// (arrays começam na posição 0)
	boolean[] prime = new boolean[n+1];

	// Chama o procedimento sieve para números até 'n' no array 'prime'
	sieve(n, prime);

	// Escreve todos os números marcados a 'true' no array 'prime'
	for (int i=2; i<=n; i++)
	    if (prime[i])
		System.out.println(i);
    }
}