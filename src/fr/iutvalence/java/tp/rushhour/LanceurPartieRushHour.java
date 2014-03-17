package fr.iutvalence.java.tp.rushhour;


/**
 * Lanceur de la partie de Rush Hour.
 * @author rabrious
 * 
 */
public class LanceurPartieRushHour
{
	// TODO (done) compléter le commentaire
	/**
	 * Création des objets et du plateau de jeu, et démarrage de la partie de Rush Hour.
	 * @param a
	 */
	public static void main(String[] a) 
	{
		RushHour partieDeRushHour = new RushHour();
		partieDeRushHour.jouer();
	}
}