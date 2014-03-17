package fr.iutvalence.java.tp.rushhour;
/**
 * Plateau de jeu de la partie
 * @author rabrious
 * 
 */
public class Plateau
{
	// TODO (done) remplacer les tableaux à 1 dimensions par 1 seul tableau à 2 dimensions !
	// TODO (done) l'attribut ne devrait pas être visible
	
	public int plateauJeux[][] = {{0,0,0,0,0,0,0,0,0},{0,1,1,1,1,1,1,0,0},{0,1,1,1,1,1,1,0,0},{0,1,1,1,1,1,1,0,0},{0,1,1,1,1,1,1,2,0},{0,1,1,1,1,1,1,0,0},{0,1,1,1,1,1,1,0,0},{0,0,0,0,0,0,0,0,0}};
	
	// TODO (done) écrire un commentaire
	/**
	 * Ligne de la grille sur laquelle nous somme en train de travailler qui serat afficher a l'écran.
	 */
	private char plateauJeuxLigneCourante[] = {'e','e','e','e','e','e','e','e','e'};
	
	/**
	 * Création du plateau de jeu.
	 */
	public Plateau()
	{
		System.out.println("  _   _   _   _   _   _   _   _   _  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[7][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[7][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[7][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[7][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[7][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[7][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[6][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[6][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[6][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[6][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[6][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[6][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[5][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[5][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[5][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[5][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[5][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[5][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[4][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[4][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[4][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[4][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[4][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[4][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[3][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[3][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[3][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[3][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[3][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[3][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[2][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[2][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[2][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[2][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[2][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[2][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[1][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[1][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[1][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[1][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[1][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[1][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[0][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[0][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[0][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[0][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[0][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[0][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  ¯   ¯   ¯   ¯   ¯   ¯   ¯   ¯   ¯  ");
	}
	
	public void miseAJourPlateau()
	{
		System.out.println("  _   _   _   _   _   _   _   _   _  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[7][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[7][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[7][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[7][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[7][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[7][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[6][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[6][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[6][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[6][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[6][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[6][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[5][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[5][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[5][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[5][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[5][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[5][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[4][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[4][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[4][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[4][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[4][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[4][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[3][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[3][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[3][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[3][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[3][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[3][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[2][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[2][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[2][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[2][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[2][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[2][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[1][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[1][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[1][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[1][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[1][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[1][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeux[0][i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeux[0][i] == 1)
			{
				plateauJeuxLigneCourante[i] = ' ';
			}
			else if(plateauJeux[0][i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeux[0][i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeux[0][i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeux[0][i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  ¯   ¯   ¯   ¯   ¯   ¯   ¯   ¯   ¯  ");
	}
	
	public void placerVoitureASortir(VoitureS voitureS)
	{
		int y = voitureS.getPY();
		int x = voitureS.getPX();
		plateauJeux[y][x] = 3;
		plateauJeux[y][x+1] = 3;
	}
	
	public void placerVoiture(VoitureS voitureS)
	{
		int yy = voitureS.getPY();
		int xx = voitureS.getPX();
		int zz = voitureS.getLongueurVehicule();
		int ww = voitureS.getSens();
		//plateauJeux[yy][xx] = 's';
		//plateauJeux[yy][xx+1] = 's';
		if(zz == 2)
		{
			if(ww == 1)
			{
				if(plateauJeux[yy][xx+1] == 1)
				{
					
				}
				else
				{
					System.out.println("Vous ne pouvez pas effectuer cette action.");
				}
			}
			else if(ww == 2)
			{
				
			}
			else if(ww == 3)
			{
				
			}
			else if(ww == 4)
			{
				
			}
		}
		else if(zz == 3)
		{
			if(ww == 1)
			{
				//if(plateauJeux[yy][xx+1] == 1 and plateauJeux[yy][xx+2] == 1)
				//{
				//	
				//}
				//else
				//{
				//	System.out.println('Vous ne pouvez pas effectuer cette action.');
				//}
			}
			else if(ww == 2)
			{
				
			}
			else if(ww == 3)
			{
				
			}
			else if(ww == 4)
			{
				
			}
		}
	}
}