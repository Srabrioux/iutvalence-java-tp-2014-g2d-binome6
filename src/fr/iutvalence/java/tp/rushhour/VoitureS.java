package fr.iutvalence.java.tp.rushhour;

/**
 * Objet voiture à faire sortir du plateau.
 * @author rabrious
 *
 */
public class VoitureS
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
	 * Taille du véhicule (en nombre de case : 2 ou 3)
	 */
	private int longueurVehicule;
	
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
	
	/**
	 * Valeur booléene indiquant si la voiture est sortie ou non.
	 */
	private boolean estSortie;
	
	// TODO Afficher la voiture sur le plateau de jeu.
	/**
	 * Constructeur de la voiture a faire sortir.
	 */
	public VoitureS()
	{
		this.pX = 2;
		this.pY = 5;
		this.longueurVehicule = 2;
		this.couleurVehicule = 1;
		this.sens = 2;
		this.estSortie = false;
	}
	
	/**
	 * Méthode faisant avancer le véhicule.
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
	 * Méthode faisant reculer le vehicule.
	 */
	public void reculer()
	{
		if(this.pX != 2)
		{
			this.pX = this.pX-1;
		}
	}
}