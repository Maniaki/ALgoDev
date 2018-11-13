package adress.model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Pendu {
	private char[] Mot;
	private char[] MotFinal;
	private int nbEssaieMax;
	
	
	public Pendu(int nbEssaieMax) {
		this.setNbEssaieMax(nbEssaieMax);
	}
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

	public char[] getMot() {
		return Mot;
	}


	public void setMot(char[] mot) {
		Mot = mot;
	}


	public int getNbEssaieMax() {
		return nbEssaieMax;
	}


	public void setNbEssaieMax(int nbEssaieMax) {
		this.nbEssaieMax = nbEssaieMax;
	}
	public boolean testLettre2(char lettre) {
		int i = 0;
		boolean verif = false;
		for(i=1;i<Mot.length-1;i++) {
			if(testLettre(lettre)) {
				verif = true;
			}
		}
		return verif;
	}
	public boolean egaux() {
		boolean verif = false;
		if(Mot.equals(MotFinal)) {
			verif = true;
		}
		return verif;
	}
	public void initialiseMotFinal() {
			this.MotFinal[1] = Mot[1];
		for(int i = 0;i<this.MotFinal.length-1;i++) {
			this.MotFinal[i] = '-';
		}
			this.MotFinal[this.MotFinal.length] = Mot[this.Mot.length];
	}
	public char[] getMotFinal() {
		return MotFinal;
	}
	public void setMotFinal(int i,char motFinal) {
		MotFinal[i] = motFinal;
	}
	
	
}
