// TODO déplacer la classe dans un paquetage (j'avais donné des consignes)
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
	 * creation du plateau de jeux et des objet de jeux.
	 */
	public void constructeur()
	{
		plateau plateauDePartie = new plateau();
		voitureS voitureASortir = new voitureS();
		voitureJ voitureDuJeux = new voitureJ();
	}
	
	// TODO corriger les problèmes d'accents
	// TODO écrire un commentaire plus précis
	/**
	 * D�marrage de la partie de Rush Hour.
	 */
	public void jouer()
	{
		System.out.println("La partie commence.");
	}
}
