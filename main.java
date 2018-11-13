package SudoLettre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main {


	public static void main(String[] args) throws ClassNotFoundException {
		
		int c=3;
		int choix=2;
		int choix2=9;
		boolean victoire = false;
	
		System.out.println("Bonjour \n Tapez 1 pour commencé une nouvelle partie \n Tapez 2 pour chargé une partie \n 0 pour partir.");
			
		while((c!=0)&&(c!=1)&&(c!=2))
		{
			Scanner s = new Scanner(System.in);
			try {
				c=s.nextInt();
			}catch(Exception e) {choix = 4;
			}
			switch(c)
			{
			case 1:
			{
			
			
		while((choix != 0)&&(choix !=1))
		{
		System.out.println("Tapez 1, si vous voulez commencé une partie \n Tapez 0 si vous voulez partir.");
		Scanner sc = new Scanner(System.in);
		try {
			choix = sc.nextInt();
			}catch(Exception e){choix = 4;
			}
		switch(choix)
		{
		case 1:
		{
			Grille_Sudoku grille = new Grille_Sudoku();
			grille.initializeGrid();
			grille.nouvelle_grille();
			grille.afficher_grille();
			do
			{
			System.out.println("tapez 1, si vous voulez joué un coup. \n tapez 2, si vous voulez affiché la grille. \n Tapez 3 pour vérifier (seulement a la fin). \n Tapez 4 pour sauvegarder \n Tapez 0 pour abandonner.");
			Scanner sc2 = new Scanner(System.in);
			try {
			choix2 = sc2.nextInt();
			}catch(Exception e){choix2 = 5;
			}
			switch(choix2)
			{
			case 1:
			{
				Scanner sc4 = new Scanner(System.in);
				int i;
				int j;
				System.out.println("Quelle ligne");
				try
				{i = sc4.nextInt();
				}
				catch(Exception e) {
					i=10;
					while((i!=1)&&(i!=2)&&(i!=3)&&(i!=4)&&(i!=5)&&(i!=6)&&(i!=7)&&(i!=8)&&(i!=9))
				{
					System.out.println("choix impossible \n Quelle ligne");
					i = sc.nextInt();
				}
				}
				
				System.out.println("Quelle colonne");
				try
				{j = sc4.nextInt();
				}
				catch(Exception e) {
					j=10;
					while((j!=1)&&(j!=2)&&(j!=3)&&(j!=4)&&(j!=5)&&(j!=6)&&(j!=7)&&(j!=8)&&(j!=9))
				{
					System.out.println("choix impossible \n Quelle colonne");
					j = sc.nextInt();
				}
				}
				if(grille.mat2[i-1][j-1]==false)
				{
					char choix4 = 'j';
					while((choix4!= 'a')&&(choix4!='b')&&(choix4!= 'c')&&(choix4!='d')&&(choix4 !='e')&&(choix4 != 'f')&&(choix4 !='g')&&(choix4!='h')&&(choix4!='i'))
					{
						System.out.println("Quelle charactere");
						choix4=sc.next().charAt(0);
						switch(choix4)
						{
						case 'a':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'b':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'c':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'd':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'e':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'f':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'g':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'h':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						case 'i':
						{
							grille.jouer_un_coup(i, j, choix4);
							break;
						}
						default:
						{
							System.out.println("essayer encore!!");
						}
						}
					}
				}
				else {
					System.out.println("try again!!");
				}
				break;
			}
			case 2:
			{
				grille.afficher_grille();
				break;
			}
			case 3:
			{
				if(grille.est_fini()==false)
				{
					System.out.println("pas fini !!!");
					break;
				}
				else
				{
					if(grille.verifie_unicite()==true)
					{
						System.out.println("you win");
						victoire = true;
						break;
					}else
					{
						System.out.println("il y a des doublons, corriger vos erreurs !!");
						break;
					}
				}
				
			}
			case 4:
			{
				File outFile = new File("SudokuSave.fic");
				try {
					FileOutputStream outFileStream = new FileOutputStream(outFile);
					ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
					outObjectStream.writeObject(grille);
					outObjectStream.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				choix = 0;
				choix2=0;
				System.out.println("A bientot");
				break;
				
			}
			case 0:
			{
				System.out.println("You loose");
				break;
			}
			default :
			{
				System.out.println("Try again !!!");
				break;
			}
				
			}
			}while((choix2 !=0)||(victoire == true));
			break;
		}
		case 0:
		{
			System.out.println("Game Over !!!!");
			break;
		}
		default :
		{
			System.out.println("Try again");
			break;
		}
		}
		}
		break;
	}
			case 2 :
			{
				FileInputStream inFileStream;
			
					// Charger partie sauvegarder
					try {
					File inFile = new File("SudokuSave.fic");
					inFileStream = new FileInputStream(inFile);
					ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
					Grille_Sudoku grille = (Grille_Sudoku) inObjectStream.readObject();
					inObjectStream.close();
					
				
				
				while((choix != 0)&&(choix !=1))
				{
				System.out.println("Tapez 1, si vous voulez commencé la partie \n Tapez 0 si vous voulez partir.");
				Scanner sc = new Scanner(System.in);
				try {
					choix = sc.nextInt();
					}catch(Exception e){choix = 4;
					}
				switch(choix)
				{
				case 1:
				{ 
					
					grille.afficher_grille();
					do
					{
					System.out.println("tapez 1, si vous voulez joué un coup. \n tapez 2, si vous voulez affiché la grille. \n Tapez 3 pour vérifier (seulement a la fin). \n Tapez 4 pour sauvegarder \n Tapez 0 pour abandonner.");
					Scanner sc2 = new Scanner(System.in);
					try {
					choix2 = sc2.nextInt();
					}catch(Exception e){choix2 = 5;
					}
					switch(choix2)
					{
					case 1:
					{
						Scanner sc4 = new Scanner(System.in);
						int i;
						int j;
						System.out.println("Quelle ligne");
						try
						{i = sc4.nextInt();
						}
						catch(Exception e) {
							i=10;
							while((i!=1)&&(i!=2)&&(i!=3)&&(i!=4)&&(i!=5)&&(i!=6)&&(i!=7)&&(i!=8)&&(i!=9))
						{
							System.out.println("choix impossible \n Quelle ligne");
							i = sc.nextInt();
						}
						}
						
						System.out.println("Quelle colonne");
						try
						{j = sc4.nextInt();
						}
						catch(Exception e) {
							j=10;
							while((j!=1)&&(j!=2)&&(j!=3)&&(j!=4)&&(j!=5)&&(j!=6)&&(j!=7)&&(j!=8)&&(j!=9))
						{
							System.out.println("choix impossible \n Quelle colonne");
							j = sc.nextInt();
						}
						}
						if(grille.mat2[i-1][j-1]==false)
						{
							char choix4 = 'j';
							while((choix4!= 'a')&&(choix4!='b')&&(choix4!= 'c')&&(choix4!='d')&&(choix4 !='e')&&(choix4 != 'f')&&(choix4 !='g')&&(choix4!='h')&&(choix4!='i'))
							{
								System.out.println("Quelle charactere");
								choix4=sc.next().charAt(0);
								switch(choix4)
								{
								case 'a':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'b':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'c':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'd':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'e':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'f':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'g':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'h':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								case 'i':
								{
									grille.jouer_un_coup(i, j, choix4);
									break;
								}
								default:
								{
									System.out.println("essayer encore!!");
								}
								}
							}
						}
						else {
							System.out.println("try again!!");
						}
						break;
					}
					case 2:
					{
						grille.afficher_grille();
						break;
					}
					case 3:
					{
						if(grille.est_fini()==false)
						{
							System.out.println("pas fini !!!");
							break;
						}
						else
						{
							if(grille.verifie_unicite()==true)
							{
								System.out.println("you win");
								victoire = true;
								break;
							}else
							{
								System.out.println("il y a des doublons, corriger vos erreurs !!");
								break;
							}
						}
						
					}
					case 4:
					{
						
						File outFile = new File("SudokuSave.fic");
						try {
							FileOutputStream outFileStream = new FileOutputStream(outFile);
							ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
							outObjectStream.writeObject(grille);
							outObjectStream.close();
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						choix = 0;
						choix2 = 0; 
						System.out.println("A bientot");
						break;
					}
					case 0:
					{
						System.out.println("You loose");
						break;
					}
					default :
					{
						System.out.println("Try again !!!");
						break;
					}
						
					}
					}while((choix2 !=0)||(victoire == true));
					break;
				}
				case 0:
				{
					System.out.println("Game Over !!!!");
					break;
				}
				default :
				{
					System.out.println("Try again");
					break;
				}
				}
				}
				} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				break;
			}
			case 0:
			{
				break;
			}
			default :
			{
				System.out.println("Try again");
			}
	}
			
		}
	}
}
