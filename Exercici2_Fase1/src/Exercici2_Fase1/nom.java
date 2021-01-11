package Exercici2_Fase1;

public class nom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char[] nom= {'D','A','V','I','D'}; //declaración e iniciación de la matriz
		
			// Declaración 
			char nom[]=new char[5];
			
			// Iniciación 	
			nom[0]='D';
			
			nom[1]='A';
			
			nom[2]='V';
			
			nom[3]='I';
			
			nom[4]='D';
			
			//Bucle determinado que recorre la matriz y muestra por consola los caracteres de cada posición		
			for(int i=0;i<nom.length;i++){
				
				
				System.out.println(nom[i]);
				
			}
		}

	}

