package LVL1_Exercici2_Fase4;

import java.util.ArrayList;

public class fullname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Character> nom = new ArrayList<Character>();
		
		nom.add('D');
		nom.add('A');
		nom.add('V');
		nom.add('I');
		nom.add('D');
		nom.add(' ');
		
ArrayList<Character> cognom = new ArrayList<Character>();
		
		cognom.add('S');
		cognom.add('U');
		cognom.add('A');
		cognom.add('R');
		cognom.add('E');
		cognom.add('Z');
			
ArrayList<Character> fullname = new ArrayList<Character>();	//Lista que une las dos anteriores.	
		
fullname.addAll(nom);
fullname.addAll(cognom);

System.out.println(fullname);
		

	}

}
