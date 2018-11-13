package SudoLettre;

import java.io.Serializable;

public class Grille_Sudoku implements Serializable{

	protected int nbColonne = 9;
	protected int nbLigne = 9;
	protected char[][] matrice = new char[9][9];
	protected boolean[][] mat2 = new boolean[9][9];
	
	public Grille_Sudoku() {
		
	}
	
	public int getNbColonne() {
		return nbColonne;
	}
	
	public void setNbColonne(int nbColonne) {
		this.nbColonne = nbColonne;
	}
	
	public int getNbLigne() {
		return nbLigne;
	}
	
	public void setNbLigne(int nbLigne) {
		this.nbLigne = nbLigne;
	}
	
	public char[][] getMatrice() {
		return matrice;
	}
	
	public void setMatrice(char[][] matrice) {
		this.matrice = matrice;
	}
	
	public void initializeGrid()
	{
		int i = 0;
		int j =0;
		for(i=0;i<=8;i++)
		{
			for(j=0;j<=8;j++)
			{
				matrice[i][j]='o';
				mat2[i][j]=false;
			}
		}
	}
	
	public void nouvelle_grille()
	{
		matrice[0][0]='a';
		matrice[0][3]='h';
		matrice[0][4]='c';
		matrice[0][8]='b';
		matrice[1][0]='e';
		matrice[1][1]='g';
		matrice[1][5]='a';
		matrice[2][3] = 'e';
		matrice[2][5] = 'i';
		matrice[2][7] = 'f';
		matrice[2][8] = 'd';
		matrice[3][0] = 'g';
		matrice[3][2] = 'd';
		matrice[3][5] = 'h';
		matrice[3][6] = 'e';
		matrice[3][7] = 'i';
		matrice[4][2] = 'c';
		matrice[4][4] = 'a';
		matrice[4][6] = 'd';
		matrice[5][1] = 'e';
		matrice[5][2] = 'a';
		matrice[5][3] = 'd';
		matrice[5][6] = 'c';
		matrice[5][8] = 'f';
		matrice[6][0] = 'c';
		matrice[6][1] = 'f';
		matrice[6][3] = 'g';
		matrice[6][5] = 'd';
		matrice[7][3] = 'f';
		matrice[7][7] = 'g';
		matrice[7][8] = 'i';
		matrice[8][0] = 'h';
		matrice[8][4] = 'e';
		matrice[8][5] = 'b';
		matrice[8][8] = 'c';
		mat2();
	}
	
	public void mat2()
	{
		for(int i = 0;i<9;i++)
		{
			for(int j =0; j<9;j++)
			{
				if(matrice[i][j]!='o')
				{
					mat2[i][j]= true;
				}
			}
		}
	}
	
	public boolean unicite_ligne()
	{
		boolean[] tab = new boolean[9];
		
		
		for(int i = 0;i<=8;i++)
		{
			for(int j = 0; j<=8;j++)
		{
			tab[j]=false;
		}
			for ( int k = 0; k<=8;k++)
			{
				switch(matrice[i][k])
				{
				case 'a':
				{
					if (tab[0]== true)
					{
						return false;
					}
					else
					{
						tab[0]= true;
					}
					break;
				}
				case 'b':
				{
					if (tab[1]== true)
					{
						return false;
					}
					else
					{
						tab[1]= true;
					}
					break;
				}
				case 'c':
				{
					if (tab[2]== true)
					{
						return false;
					}
					else
					{
						tab[2]= true;
					}
					break;
				}
				case 'd':
				{
					if (tab[3]== true)
					{
						return false;
					}
					else
					{
						tab[3]= true;
					}
					break;
				}
				case 'e':
				{
					if (tab[4]== true)
					{
						return false;
					}
					else
					{
						tab[4]= true;
					}
					break;
				}
				case 'f':
				{
					if (tab[5]== true)
					{
						return false;
					}
					else
					{
						tab[5]= true;
					}
					break;
				}
				case 'g':
				{
					if (tab[6]== true)
					{
						return false;
					}
					else
					{
						tab[6]= true;
					}
					break;
				}
				case 'h':
				{
					if (tab[7]== true)
					{
						return false;
					}
					else
					{
						tab[7]= true;
					}
					break;
				}
				case 'i':
				{
					if (tab[8]== true)
					{
						return false;
					}
					else
					{
						tab[8]= true;
					}
					break;
				}
				default:
				{
					break;
				}
				}
			}
		}
		return true;
	}
	
	public boolean unicite_colonne()
	{
		boolean[] tab = new boolean[9];
		
		
		for(int i = 0;i<=8;i++)
		{
			for(int j = 0; j<=8;j++)
		{
			tab[j]=false;
		}
			for ( int k = 0; k<=8;k++)
			{
				switch(matrice[k][i])
				{
				case 'a':
				{
					if (tab[0]== true)
					{
						return false;
					}
					else
					{
						tab[0]= true;
					}
					break;
				}
				case 'b':
				{
					if (tab[1]== true)
					{
						return false;
					}
					else
					{
						tab[1]= true;
					}
					break;
				}
				case 'c':
				{
					if (tab[2]== true)
					{
						return false;
					}
					else
					{
						tab[2]= true;
					}
					break;
				}
				case 'd':
				{
					if (tab[3]== true)
					{
						return false;
					}
					else
					{
						tab[3]= true;
					}
					break;
				}
				case 'e':
				{
					if (tab[4]== true)
					{
						return false;
					}
					else
					{
						tab[4]= true;
					}
					break;
				}
				case 'f':
				{
					if (tab[5]== true)
					{
						return false;
					}
					else
					{
						tab[5]= true;
					}
					break;
				}
				case 'g':
				{
					if (tab[6]== true)
					{
						return false;
					}
					else
					{
						tab[6]= true;
					}
					break;
				}
				case 'h':
				{
					if (tab[7]== true)
					{
						return false;
					}
					else
					{
						tab[7]= true;
					}
					break;
				}
				case 'i':
				{
					if (tab[8]== true)
					{
						return false;
					}
					else
					{
						tab[8]= true;
					}
					break;
				}
				default :
				{
					break;
				}
				}
			}
		}
		return true;
	}
	
	
	boolean unicite_Region(int l, int c)
{
 boolean tab2[] = new boolean[9];
 for(int t = 0; t<=8;t++)
 {
	 tab2[t]=false;
 }
 for (int i = l;i<=l+2;i++)
 {
	 for(int j= c;j<=c+2;j++)
	 {
		 switch(matrice[i][j])
			{
			case 'a':
			{
				if (tab2[0]== true)
				{
					return false;
				}
				else
				{
					tab2[0]= true;
				}
				break;
			}
			case 'b':
			{
				if (tab2[1]== true)
				{
					return false;
				}
				else
				{
					tab2[1]= true;
				}
				break;
			}
			case 'c':
			{
				if (tab2[2]== true)
				{
					return false;
				}
				else
				{
					tab2[2]= true;
				}
				break;
			}
			case 'd':
			{
				if (tab2[3]== true)
				{
					return false;
				}
				else
				{
					tab2[3]= true;
				}
				break;
			}
			case 'e':
			{
				if (tab2[4]== true)
				{
					return false;
				}
				else
				{
					tab2[4]= true;
				}
				break;
			}
			case 'f':
			{
				if (tab2[5]== true)
				{
					return false;
				}
				else
				{
					tab2[5]= true;
				}
				break;
			}
			case 'g':
			{
				if (tab2[6]== true)
				{
					return false;
				}
				else
				{
					tab2[6]= true;
				}
				break;
			}
			case 'h':
			{
				if (tab2[7]== true)
				{
					return false;
				}
				else
				{
					tab2[7]= true;
				}
				break;
			}
			case 'i':
			{
				if (tab2[8]== true)
				{
					return false;
				}
				else
				{
					tab2[8]= true;
				}
				break;
			}
			default :
			{
				break;
			}
			}
		}
	 }
return true;
}
	
	public boolean verifie_unicite()
	{
		if(unicite_ligne() == false)
		{
			return false;
		}
		if(unicite_colonne() == false)
		{
			return false;
		}
		for(int i = 0;i<9;i=i+3)
		{
			for(int j=0;j<9;j=j+3)
			{
				if(unicite_Region(i,j)==false)
				{
					return false;
				}
			}
		}
		return true;
		
	}
	
	public void jouer_un_coup(int i, int j, char c)
	{
		matrice[i-1][j-1]=c;
	}
	
	public void afficher_grille()
	{
		for( int i = 0;i<=8;i++)
		{
			System.out.println( matrice[i][0] + " | " + matrice[i][1] + " | " + matrice[i][2] + " | " +matrice[i][3] + " | " +
					matrice[i][4] + " | " + matrice[i][5] + " | " + matrice[i][6] + " | " + matrice[i][7] + " | " + matrice[i][8] + " | " );
		}
	}

	public boolean est_fini()
	{
		for(int i=0;i<9;i++)
		{
			for(int j =0;j<9;j++)
			{
				if(matrice[i][j]=='o')
				{
					return false;
				}
			}
		}
		return true;
	}
	
	
}
