package fr.iutvalence.java.tp.rushhour;
/**
 * Objet voiture : obstacle à bouger sur le plateau.
 * @author rabrious
 *
 */
public class Voiture
{
	/**
	 * Coordonée X de l'arriere du véhicule sur la grille de jeu.
	 */
	private int pX;

	/**
	 * Coordonées Y de l'arriere du véhicule sur la grille de jeu.
	 */
	private int pY;
	
	/**
	 * Couleur du véhicule (couleur 1, 2 ou 3)
	 */
	private int couleurVehicule;
	
	/**
	 * Orientation du véhicule sur la grille de jeu.
	 * 1 : vers le haut
	 * 2 : vers la droite
	 * 3 : vert le bas
	 * 4 : vers la gauche
	 */
	private int sens;

	private boolean estSortie;

	/**
	 * Création d'un objet Voiture de jeu.
	 * @param positionX
	 * @param positionY
	 * @param longueurDuVehicule
	 * @param couleurDuVehicule
	 * @param sensDuVéhicule
	 */
	public Voiture(int positionX, int positionY,int couleurDuVehicule, int sensDuVéhicule)
	{
		this.pX = positionX;
		this.pY = positionY;
		this.couleurVehicule = couleurDuVehicule;
		this.sens = sensDuVéhicule;
	}
	
	public Voiture()
	{
		this.pX = 1;
		this.pY = 4;
		this.couleurVehicule = 1;
		this.sens = 2;
		this.estSortie = false;
	}
	
	/**
	 * Méthode faisant avancer le véhicule.
	 */
	
	public int getPX()
	{
		return pX;
	}
	
	public int getPY()
	{
		return pY;
	}
	
	public int getSens()
	{
		return sens;
	}
	
	public boolean getEstSortie() 
	{
		return this.estSortie;
	}
	
	/**
	 * Méthode faisant avancer la voiture à sortir.
	 */
	public void avancer()
	{
		if(this.pX == 6)
		{
			this.pX = this.pX+1;
			this.estSortie = true;
		}
		else
		{
			this.pX = this.pX+1;
		}
	}
	
	/**
	 * Méthode faisant reculer la voiture à sortir.
	 */
	public void reculer()
	{
		if(this.pX != 2)
		{
			this.pX = this.pX-1;
		}
	}
}
