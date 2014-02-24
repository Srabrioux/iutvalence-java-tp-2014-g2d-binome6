package fr.iutvalence.java.tp.rushhour;
// TODO d�placer la classe dans un paquetage (j'avais donn� des consignes)
/**
 * Description d'une partie de Rush Hour
 * @author rabrious
 * 
 */
public class RushHour
{
	// TODO �crire un constructeur (ce n'en est pas un)
	
	// TODO �crire un commentaire plus pr�cis
	/**
	 * creation du plateau de jeux et des objet de jeux.
	 */
	public void constructeur()
	{
		plateau plateauDePartie = new plateau();
		voitureS voitureASortir = new voitureS();
		voitureJ voitureDuJeux = new voitureJ();
	}
	
	// TODO corriger les probl�mes d'accents
	// TODO �crire un commentaire plus pr�cis
	/**
	 * D�marrage de la partie de Rush Hour.
	 */
	public void jouer()
	{
		System.out.println("La partie commence.");
	}
}
