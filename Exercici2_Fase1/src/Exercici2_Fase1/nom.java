package Exercici2_Fase1;

public class nom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char[] nom= {'D','A','V','I','D'}; //declaraci�n e iniciaci�n de la matriz
		
			// Declaraci�n 
			char nom[]=new char[5];
			
			// Iniciaci�n 	
			nom[0]='D';
			
			nom[1]='A';
			
			nom[2]='V';
			
			nom[3]='I';
			
			nom[4]='D';
			
			//Bucle determinado que recorre la matriz y muestra por consola los caracteres de cada posici�n		
			for(int i=0;i<nom.length;i++){
				
				
				System.out.println(nom[i]);
				
			}
		}

	}

