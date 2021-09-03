package Exdercicios03_09_21;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
      int[] num = new int[6];
      int x,numP,somaP=0,numI,contI=0;
      
      Scanner leia = new Scanner(System.in);
      for(x=0;x<6;x++) 

      { 

      System.out.println("\nEntre com o número: ");
      num[x] = leia.nextInt();
      
      if(num[x] %2 ==0) 
      {
    	  System.out.println("\n"+num[x]+"é número par");
    	  somaP += num[x];
      }
      else 
      {
    	  contI++;
    	  System.out.println("\n"+num[x]+"é numero impar");
      }

      } 
      System.out.println("\nA soma dos pares é:"+somaP);
      System.out.println("\nA quantidade dos ímpares é:"+contI);
      
	}

}
