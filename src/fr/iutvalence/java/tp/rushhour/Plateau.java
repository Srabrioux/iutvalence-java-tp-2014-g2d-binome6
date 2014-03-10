package fr.iutvalence.java.tp.rushhour;
/**
 * Plateau de jeu de la partie
 * @author rabrious
 *
 */
// TODO respecter les conventions d'écriture
public class Plateau
{
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 1 de la grille de jeu.
	 */
	public int plateauJeuxLigneUn [] = {0,0,0,0,0,0,0,0,0};
	
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 2 de la grille de jeu.
	 */
	public int plateauJeuxLigneDeux [] = {0,1,1,1,1,1,1,0,0};
	
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 3 de la grille de jeu.
	 */
	public int plateauJeuxLigneTrois [] = {0,1,1,1,1,1,1,0,0};
	
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 4 de la grille de jeu.
	 */
	public int plateauJeuxLigneQuatre [] = {0,1,1,1,1,1,1,0,0};
	
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 5 de la grille de jeu.
	 */
	public int plateauJeuxLigneCinq [] = {0,3,3,1,1,1,1,2,0};
	
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 6 de la grille de jeu.
	 */
	public int plateauJeuxLigneSix [] = {0,1,1,1,1,1,1,0,0};
	
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 7 de la grille de jeu.
	 */
	public int plateauJeuxLigneSept [] = {0,1,1,1,1,1,1,0,0};
	
	/**
	 * Tableau indiquant se que contient chaque case de la ligne 8 de la grille de jeu.
	 */
	public int plateauJeuxLigneHuit [] = {0,0,0,0,0,0,0,0,0};
	
	public char plateauJeuxLigneCourante [] = {'e','e','e','e','e','e','e','e','e'};
	
	public Plateau()
	{
		System.out.println("  _   _   _   _   _   _   _   _   _  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneHuit[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneHuit[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneHuit[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneHuit[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneHuit[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneHuit[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneSept[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneSept[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneSept[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneSept[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneSept[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneSept[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneSix[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneSix[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneSix[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneSix[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneSix[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneSix[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneCinq[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneCinq[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneCinq[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneCinq[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneCinq[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneCinq[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneQuatre[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneQuatre[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneQuatre[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneQuatre[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneQuatre[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneQuatre[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneTrois[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneTrois[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneTrois[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneTrois[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneTrois[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneTrois[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneDeux[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneDeux[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneDeux[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneDeux[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneDeux[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneDeux[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  —   —   —   —   —   —   —   —   —  ");
		for(int i=0; i<9; i++)
		{
			if(plateauJeuxLigneUn[i] == 0)
			{
				plateauJeuxLigneCourante[i] = 'e';
			}
			else if(plateauJeuxLigneUn[i] == 1)
			{
				plateauJeuxLigneCourante[i] = 'i';
			}
			else if(plateauJeuxLigneUn[i] == 2)
			{
				plateauJeuxLigneCourante[i] = 'w';
			}
			else if(plateauJeuxLigneUn[i] == 3)
			{
				plateauJeuxLigneCourante[i] = 's';
			}
			else if(plateauJeuxLigneUn[i] == 4)
			{
				plateauJeuxLigneCourante[i] = '2';
			}
			else if(plateauJeuxLigneUn[i] == 5)
			{
				plateauJeuxLigneCourante[i] = '3';
			}
		}
		System.out.println("| " + plateauJeuxLigneCourante[0] + " | " + plateauJeuxLigneCourante[1] + " | " + plateauJeuxLigneCourante[2] + " | " + plateauJeuxLigneCourante[3] + " | " + plateauJeuxLigneCourante[4] + " | " + plateauJeuxLigneCourante[5] + " | " + plateauJeuxLigneCourante[6] + " | " + plateauJeuxLigneCourante[7] + " | " + plateauJeuxLigneCourante[8] + " |");
		System.out.println("  ¯   ¯   ¯   ¯   ¯   ¯   ¯   ¯   ¯  ");
	}
}