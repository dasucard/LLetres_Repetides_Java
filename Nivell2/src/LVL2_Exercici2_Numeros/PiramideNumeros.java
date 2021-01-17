package LVL2_Exercici2_Numeros;

import java.util.*;


public class PiramideNumeros{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);// Escanea la consola.
	System.out.print("Introduzca numero de filas: "); // Imprime en la consola el texto.
	int numFilas = sc.nextInt();// Guarda en una variable entera el numero que ponga por consola.
	sc.close();//Deja de escanear.
	
	System.out.println(); //Me hace un salto de linea.
    for(int altura = 1; altura<=numFilas; altura++){ //bucle anidado. Mientras la altura sea mas pequeña o igual al numero escrito, sumame una linea.
        
        //numeros
        for(int numero=1; numero<=altura; numero++){
            System.out.print(numero);
    	
        }

        System.out.println(); //salto de linea.
    }
}
}