/**
 * Description d'une partie de Rush Hour
 * @author rabrious
 * 
 */
public class RushHour
{
	/**
	 * creation du plateau de jeux et des objet de jeux.
	 */
	public void constructeur()
	{
		plateau plateauDePartie = new plateau();
		voitureS voitureASortir = new voitureS();
		voitureJ voitureDuJeux = new voitureJ();
	}
	
	/**
	 * Démarrage de la partie de Rush Hour.
	 */
	public void jouer()
	{
		System.out.println("La partie commence.");
	}
}
