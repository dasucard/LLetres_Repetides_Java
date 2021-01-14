package LVL1_Exercici2_Fase3;

import java.util.*;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaración e inicialización del ArrayList
		ArrayList<Character> nom = new ArrayList<Character>();
		
		nom.add('D');
		nom.add('A');
		nom.add('V');
		nom.add('I');
		nom.add('D');
		
		System.out.println(nom);
		
		countFrequencies(nom);
			

	}
	
	public static void countFrequencies(ArrayList<Character> nom){
		
		//Declaración e Iniciación del hashmap para guardar la frecuencia de las letras
		HashMap<Character, Integer> lletra = new HashMap<Character, Integer>();
		
		//Bucle for each que recorre el mapa y agrega una clave en el mapa  
		for (Character i : nom) {
			
			//Cuando hay una letra se ejecuta (? 1),  si se repite pasa a ejecutarse lo siguiente (: j + 1)
			Integer j = lletra.get(i); 		
			lletra.put(i, j == null ? 1 : j + 1); //me agrega  el caracter de cada posicion en la lista y su clave si la j es == 1 me aumenta 1 sin agregar mas caracteres.
			
			
		}
		
		for (HashMap.Entry<Character, Integer> val : lletra.entrySet()){
			
			System.out.println("El elemento " + val.getKey() + " " + "Se repite" + ": " + val.getValue() + " veces.");
			
		}

		System.out.println(lletra);
	}
}





