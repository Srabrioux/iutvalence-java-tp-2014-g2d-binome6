package fr.iutvalence.java.tp.rushhour;
/**
 * Description d'une partie de Rush Hour
 * @author rabrious
 * 
 */
public class RushHour
{
	
	// TODO (done) écrire un constructeur (ce n'en est pas un)
	// TODO (done) écrire un commentaire plus précis
	/**
	 * Créer le plateau de jeu, la voiture à faire sortir et les voitures obstacles.
	 */
	public RushHour()
	{
		plateau plateauDePartie = new plateau();
		VoitureS voitureASortir = new VoitureS();
		VoitureJ voitureDuJeux = new VoitureJ(0, 0, 0, 0);
	}
	
	// TODO (done) écrire un commentaire plus précis
	// TODO Tester la creation des objets voitures
	/**
	 * Mise en route de la partie de Rush Hour.
	 */
	public void jouer()
	{
		System.out.println("La partie commence.");
	}
}
