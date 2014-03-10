package fr.iutvalence.java.tp.rushhour;
/**
 * Objet voiture : obstacle à bouger sur le plateau.
 * @author rabrious
 *
 */
public class VoitureJ
{
	// TODO (done) l'attribut ne devrait pas être visible
	// TODO (done) écrire le commentaire
	/**
	 * Coordonée X de l'arriere du véhicule sur la grille de jeu.
	 */
	private int pX;

	// TODO (done) l'attribut ne devrait pas être visible
	// TODO (done) écrire le commentaire
	/**
	 * Coordonées Y de l'arriere du véhicule sur la grille de jeu.
	 */
	private int pY;
	
	// TODO (done) l'attribut ne devrait pas être visible
	// TODO (done) écrire le commentaire
	/**
	 * Taille du véhicule (en nombre de case : 2 ou 3)
	 */
	private int longueurVehicule;
	
	/**
	 * Couleur du véhicule (couleur 1, 2 ou 3)
	 */
	private int couleurVehicule;
	
	// TODO (done) l'attribut ne devrait pas être visible
	// TODO (done) écrire le commentaire
	/**
	 * Orientation du véhicule sur la grille de jeu.
	 * 1 : vers le haut
	 * 2 : vers la droite
	 * 3 : vert le bas
	 * 4 : vers la gauche
	 */
	private int sens;

	// TODO (done) écrire le commentaire
	// TODO (done)renommer les paramètres
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
	
	// TODO (done) écrire le commentaire
	/**
	 * Méthode faisant avancer le véhicule.
	 */
	public void avancer()
	{
		
	}
	
	// TODO (done) écrire le commentaire
	/**
	 * Méthode faisant reculer le véhicule.
	 */
	public void reculer()
	{

	}
}
