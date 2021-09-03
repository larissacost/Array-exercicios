package Exdercicios03_09_21;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		final int linha=3,coluna=3; 
		int num[][] = new int[linha][coluna]; 
        int contD=0,x; 
        
        Scanner leia = new Scanner(System.in); 
        for(int l=0;l<linha;l++) 
        { 
         for(int c=0;c<coluna;c++) 
          { 
           System.out.println("\nLeia um número: "); 
           num[l][c] = leia.nextInt(); 
          } 
        } 
        for(int l=0;l<linha;l++) 
        { 
         for(int c=0;c<coluna;c++) 
          { 
           if (num[l][c] > 10) 
           {
        	   contD++;
           }
          } 
        }
        System.out.println("\nA uantidade de números maiores que 10 é: "+contD);
        
        
        
	}

}
