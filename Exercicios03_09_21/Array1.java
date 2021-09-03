package Exdercicios03_09_21;

public class Array1 {

	public static void main(String[] args) {
		int x=0,somaA=0;
		int []A= {1,0,5,-2,-5,7};
		
		for(x=0;x<3;x++) {
				somaA += A[x];
		}
        System.out.println("\nA soma das três primeiras posições é: "+somaA);
        
        for(x=0;A[x]<6;x++)
        {
        	if(A[x] == -2) 
        	{
        		A[x] = 100;
        	}
        }
        for(x = 0; x < 6; x++) {
			System.out.println("O valor na posição " + x + " é de: " + A [x]);
		}
        
        
	}

}
