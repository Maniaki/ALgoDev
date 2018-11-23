package adress.model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Pendu {
	private char[] Mot; //Mot non caché
	private char[] MotFinal; //Mot caché du type (A----E)
	private int nbEssaieMax; 
	
	
	public Pendu(int nbEssaieMax) {
		this.setNbEssaieMax(nbEssaieMax);
	}
	//Trouver le mot Aléatoire du dictionnaire
	public void trouverMotAléatoire() {
		Random r = new Random();
		int compteur = 1;
		int valeur = 1 + r.nextInt(369086 - 1);
		try
		{
		    File f = new File ("dico.txt");
		    FileReader fr = new FileReader (f);
		    BufferedReader br = new BufferedReader (fr);
		 
		    try
		    {
		        String line = br.readLine();
		 
		        while (compteur != valeur)
		        {
		            line = br.readLine();
		            compteur++;
		        }
		        System.out.println(line);
		        this.Mot = line.toCharArray();
		        this.MotFinal = line.toCharArray();
		        br.close();
		        fr.close();
		    }
		    catch (IOException exception)
		    {
		        System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		    }
		}
		catch (FileNotFoundException exception)
		{
		    System.out.println ("Le fichier n'a pas été trouvé");
		}
		
	}
//Méthode qui verifie si la lettre entrée correspond au mot
	public boolean testLettre(char lettre) {
		boolean verif = false;
		int i = 0;
		for(i=0;i<this.Mot.length;i++) {
			if(Mot[i] == lettre ) {
				verif = true;
			}
		}
		return verif;
	}
	//Methode permet d'Initialisé le mot caché 
		public void initialiseMotFinal(int lengthMotFinal,int lengthMot) {
				this.MotFinal[0] = Mot[0];
			for(int i = 1;i<this.MotFinal.length-1;i++) {
				this.MotFinal[i] = '-';
			}
			this.MotFinal[lengthMotFinal-1] = Mot[lengthMot-1];
		}
		
		public boolean testMot() {
			boolean verif = true;
			int i = 0;
			for(i=0;i<Mot.length;i++) {
				if(Mot[i] != MotFinal[i]) {
					verif = false;
				}
			}
			return verif;
		}

	public char[] getMot() {
		return Mot;
	}


	public void setMot(int i,char mot) {
		Mot[i] = mot;
	}


	public int getNbEssaieMax() {
		return nbEssaieMax;
	}


	public void setNbEssaieMax(int nbEssaieMax) {
		this.nbEssaieMax = nbEssaieMax;
	}
	
	public boolean egaux() {
		boolean verif = false;
		if(Mot.equals(MotFinal)) {
			verif = true;
		}
		return verif;
	}
	public char[] getMotFinal() {
		return MotFinal;
	}
	public void setMotFinal(int i,char motFinal) {
		MotFinal[i] = motFinal;
	}
	
	
}
