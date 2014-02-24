package fr.iutvalence.java.tp.rushhour;
/**
 * Description d'une partie de Rush Hour
 * @author rabrious
 * 
 */
public class RushHour
{
	// TODO écrire un constructeur (ce n'en est pas un)
	
	// TODO écrire un commentaire plus précis
	/**
	 * création du plateau de jeu et des objets de jeu.
	 */
	public void constructeur()
	{
		plateau plateauDePartie = new plateau();
		voitureS voitureASortir = new voitureS();
		voitureJ voitureDuJeux = new voitureJ();
	}
	
	// TODO écrire un commentaire plus précis
	/**
	 * Démarrage de la partie de Rush Hour.
	 */
	public void jouer()
	{
		System.out.println("La partie commence.");
	}
}
