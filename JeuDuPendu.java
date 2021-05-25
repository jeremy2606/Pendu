package pendu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JeuDuPendu {

	 public static void main(String[] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  char valeurSaisie ;
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
		  tabDeMots.add("Boursouflure") ;
		  tabDeMots.add("Patriarche") ;
		  tabDeMots.add("Hardrock") ;
		  tabDeMots.add("Miraculeuse") ;
		  List<ArrayList<String>> list = Arrays.asList(tabDeMots);
		  
		  
		  //toutes les decla:
		  
		  Random random = new Random();
		  int indexAleatoire = random.nextInt(9);
		  
		  String motATrouver = tabDeMots.get(indexAleatoire);
		  int longueurDuMotATrouver = motATrouver.lenght(); //on garde la longueur du mot a deviner dans cette variable
		  
		  char tableauCaracteresADeviner[]; //creation d un tableau de la meme taille que le mot a deviner
		  tableauCaracteresADeviner = new char [longueurDuMotATrouver];
		  
		  for (i=0; i<tableauCaracteresADeviner; i++;) { //remplissagr grace a cette boucle
			  if (i = 0) { //on met la premiere lettre 
				  tableauDemotADeviner[i] = motATrouver.charAt(i);
			  }
			  else {
				  tableauCaractereADeviner[i] = "_"; //pour le reste du mot on met des tirets
				  }
			  
			  System.out.println(tableauCaractereADeviner[i]); // affichage des caracteres
		  
		  char verifSaisie []; //tabeau servant a verifier si la lettre et bonne . sa longuer est egale aux nbres d'erreur
		  verifSaisie = new char [nbreErreursMax];
		  
		 
		  for (int i=1; i<=longueurDuMotATrouver; i++) {
			   
		  //System.out.println(motATrouver);creer un tabeau de caractere qui soit de la meme la taille que le motATrouver: if ((valeurSaisie == motATrouver.charAt(i))) {
			  //si ya correspondance on remplace la lettre avec tabDeMots [i] = valeurSaisie	
			  if ((valeurSaisie == motATrouver.charAt(i))) {
				  tabDeMots [i] = valeurSaisie;}
				  
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
