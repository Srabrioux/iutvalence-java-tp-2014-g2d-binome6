package fr.iutvalence.java.tp.rushhour;
/**
 * Description d'une partie de Rush Hour
 * @author rabrious
 * 
 */
public class RushHour
{
	/**
	 * Créer le plateau de jeu, la voiture à faire sortir et les voitures obstacles.
	 */
	public RushHour()
	{
		Plateau plateauDePartie = new Plateau();
		VoitureS voitureASortir = new VoitureS();
		//VoitureJ voitureDuJeux = new VoitureJ(0, 0, 0, 0, 0);
	}
	
	// TODO Tester la creation des objets voitures
	/**
	 * Mise en route de la partie de Rush Hour.
	 */
	public void jouer()
	{
		System.out.println("La partie commence.");
	}
}
