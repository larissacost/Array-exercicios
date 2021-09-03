package Exdercicios03_09_21;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		final int linha=2,coluna=2; 
		float matriz1[][] = new float[linha][coluna]; 
		float matriz2[][] = new float[linha][coluna]; 
        float somaM[][] = new float[linha][coluna]; 
        float subM[][] = new float[linha][coluna];
        float constM[][] = new float[linha][coluna];
        int op,l,c;
        
        Scanner leia = new Scanner(System.in);
        for(l=0;l<linha;l++) 
        { 
         for(c=0;c<coluna;c++) 
          { 
           System.out.println("\nEntre com o valor da matriz 1:");
           matriz1[l][c] = leia.nextInt();
           System.out.println("\nEntre com o valor da matriz 2:");
           matriz2[l][c] = leia.nextInt();
          } 
        }
        
        System.out.println("\n\t\tMenu-escolha uma opção! ");
        System.out.println("\n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes\n");
        System.out.println("\nEntre com uma opção: ");
        op = leia.nextInt();
        
        switch(op)
        { 
        case 1:
        for(l=0;l<linha;l++) 
        { 
         for(c=0;c<coluna;c++) 
          { 
           somaM[l][c] = matriz1[l][c]+ matriz2[l][c] ;
           System.out.println("\nO valor da posiçao [" +l+"]"+"["+c+"]"+"é: "+somaM[l][c]);
          } 
        }
        break;
        case 2:
            for(l=0;l<linha;l++) 
            { 
             for(c=0;c<coluna;c++) 
              { 
            	 subM[l][c] = matriz2[l][c]+ matriz1[l][c] ;
            	 System.out.println("\nO valor da posiçao [" +l+"]"+"["+c+"]"+"é: "+subM[l][c]);
              } 
            }
            break;
        case 3:
            for(l=0;l<linha;l++) 
            { 
             for(c=0;c<coluna;c++) 
              { 
            	 System.out.println("\nEntre com o valor constante:");
            	 constM[l][c] = leia.nextFloat();
            	
              } 
            }
            for(l=0;l<linha;l++) 
            { 
             for(c=0;c<coluna;c++) 
              { 
             System.out.println("\nO valor da posiçao [" +l+"]"+"["+c+"]"+"é: "+constM[l][c]);
              }
            }
            break;
        case 4:
            for(l=0;l<linha;l++) 
            { 
             for(c=0;c<coluna;c++) 
              { 
            	 System.out.println("\nO valor da posiçao [" +l+"]"+"["+c+"]"+" da matriz 1 é: "+somaM[l][c]);
            	 System.out.println("\nO valor da posiçao [" +l+"]"+"["+c+"]"+" da matriz 2 é: "+subM[l][c]);
            	 System.out.println("\nO valor da posiçao [" +l+"]"+"["+c+"]"+" da matriz constante é: "+constM[l][c]);
              } 
            }
            break;
            default:
            	System.out.println("\nOpçaõ inválida!");
            
            
        }
       
		
	}

}
