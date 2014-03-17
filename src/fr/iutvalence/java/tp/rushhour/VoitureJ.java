package fr.iutvalence.java.tp.rushhour;
/**
 * Objet voiture : obstacle à bouger sur le plateau.
 * @author rabrious
 *
 */
public class VoitureJ
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
	 * Création d'un objet Voiture de jeu.
	 * @param positionX
	 * @param positionY
	 * @param longueurDuVehicule
	 * @param couleurDuVehicule
	 * @param sensDuVéhicule
	 */
	public VoitureJ(int positionX, int positionY, int longueurDuVehicule,int couleurDuVehicule, int sensDuVéhicule)
	{
		this.pX = positionX;
		this.pY = positionY;
		this.longueurVehicule = longueurDuVehicule;
		this.couleurVehicule = couleurDuVehicule;
		this.sens = sensDuVéhicule;
	}
	
	/**
	 * Méthode faisant avancer le véhicule.
	 */
	public void avancer()
	{
		
	}
	
	/**
	 * Méthode faisant reculer le véhicule.
	 */
	public void reculer()
	{

	}
	
	public int getPX()
	{
		return pX;
	}
	
	public int getPY()
	{
		return pY;
	}
}
