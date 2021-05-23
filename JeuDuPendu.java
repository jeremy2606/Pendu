package pendu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JeuDuPendu {

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String valeurSaisie = null;
		  System.out.println("Essayez de deviner le mot auquel je pense");
		  System.out.println("Rentrez une lettre par une lettre");
		  System.out.println("Attention, tapez les lettres en majuscule");
		  System.out.println("Bonne chance !");
		  int nbreErreursMax = 10;
		  ArrayList<String> tabDeMots = new ArrayList<String>();
		  tabDeMots.add("Tabulation") ;
		  tabDeMots.add("Equilibre") ;
		  tabDeMots.add("Attirance") ;
		  tabDeMots.add("Pourquoi") ;
		  tabDeMots.add("Arriver") ;
		  tabDeMots.add("Portiere") ;
		  tabDeMots.add("Boursuflure") ;
		  tabDeMots.add("Patriarche") ;
		  tabDeMots.add("Hardrock") ;
		  tabDeMots.add("Miraculeuse") ;
		  List<ArrayList<String>> list = Arrays.asList(tabDeMots);
		  
		  
		  Random random = new Random();
		  int indexAleatoire = random.nextInt(9);
		  
		  String motATrouver = tabDeMots.get(indexAleatoire);
		  int longMotATrouver = motATrouver.length();
		  for (int i=1; i<=longMotATrouver; i++) { 
		  }
	<<<<<<< HEAD
		  //System.out.println(motATrouver);
	      
		  do {
			  System.out.println("Vous avez "+nbChance+" chances");
			    System.out.println(String.join(" ", tabUnderscore));
		        valeurSaisie = sc.nextLine();
		        String caract = valeurSaisie.toUpperCase();
			    if (motATrouver.contains(caract)) {
			    
			    }
			    else{
			    	nbChance=nbChance-1;
			    }
		  }while (nbChance!=0);
	}// test d un push a distance .voir si vous le recevez les gars.
	}
	=======
			  
		  for (int i=0; i<10; i++) {
			  valeurSaisie = sc.nextLine();
		  }
		  
		  
			  
			  if(motATrouver.contains(valeurSaisie)) {
				  System.out.println("Cette lettre ne se trouve pas dans le mot a trouver");
			  }
			  else {
				  System.out.println("Bravo vous avez trouve une lettre !");
			  }
			  sc.close();
		  }

		  
	}

	>>>>>>> branch 'master' of https://github.com/jeremy2606/Jeu_du_pendue.git

	
}
