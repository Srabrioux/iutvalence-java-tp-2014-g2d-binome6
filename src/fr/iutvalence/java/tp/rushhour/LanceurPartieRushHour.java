package fr.iutvalence.java.tp.rushhour;


/**
 * Creation et démarrage d'une partie de Rush Hour.
 * @author rabrious
 * 
 */
public class LanceurPartieRushHour
{
	/**
	 * 
	 * @param a
	 */
	public static void main(String[] a) 
	{
		RushHour partieDeRushHour = new RushHour();

		partieDeRushHour.jouer();
	}
}