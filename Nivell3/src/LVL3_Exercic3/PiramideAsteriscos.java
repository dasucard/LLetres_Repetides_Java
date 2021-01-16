package LVL3_Exercic3;

import java.util.*;

public class PiramideAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: "); // Imprime en la consola el texto.
		int NumFilas = sc.nextInt();
		sc.close();
		
		System.out.println();
		for (int altura = NumFilas;altura >= 1 ; altura--){ //bucle anidado 
			
			//Espacios en blanco
            for(int blancos = 1; blancos<=NumFilas-altura; blancos++){ 
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){ // el numero de asteriscos en la base de la piramide  es igual a dos veces su altura menos uno. 
                System.out.print("*");
            }
            System.out.println();
		}
		
	
	}

}
