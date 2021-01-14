package LVL1_Exercici2_Fase2;

import java.util.*;

public class Lista{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> nom;// Declaración de ArrayList
		nom = new ArrayList<Character>(); // Inicializacióm de ArrayList
		
		// Agregar elementos a la lista.  
		
		nom.add('D');
		nom.add('A');
		nom.add('V');
		nom.add('I');
		nom.add('D');
				
		//mostrar los contenidos de la ArrayList
		
		System.out.println(nom);
		
		for (int i=0;i<nom.size();i++){// bucle determinado.
			
			// flag permite reconocer que tipo de caracter (numero o letra) tiene la ArrayList y devuelve un booleano.
			
			boolean flag = Character.isDigit(nom.get(i)); // isDigit() devuelve true si el caracter es un digito.
			
			if (flag){
				
				System.out.println("'" + nom.get(i) + "'" + " Los nombres de personas no contienen numeros!");
				
			}
		
			// Al ser un caracter no me deja poner la función de nom.equalsIgnoreCase(i), como si de un String se tratase, con lo cual los caracteres han de ser o bien todos en mayuscula o bien todos en minuscula.
			
			else if (nom.get(i)== 'A'){ 
				
				System.out.println(nom.get(i)+ " es una VOCAL");
			}
			
			else if (nom.get(i)== 'E'){
				
				System.out.println(nom.get(i) + " es una VOCAL");
			}
			
			else if (nom.get(i)== 'I'){
				
				System.out.println(nom.get(i) + " es una VOCAL");
			
			}
			
			else if (nom.get(i)== 'O'){
				
				System.out.println(nom.get(i) + " es una VOCAL");
			
			}
			
			else if (nom.get(i)== 'U'){
				
				System.out.println(nom.get(i) + " es una VOCAL");
		
			}
			
			else {
				
				System.out.println(nom.get(i) + " es una CONSONANTE");
			}
			
		}
		
	}

}
