package fr.iutvalence.java.tp.rushhour;
/**
 * Description d'une partie de Rush Hour
 * @author rabrious
 * 
 */
public class RushHour
{
	private int nombreVoitureDansLaPertie;
	
	/**
	 * Créer le plateau de jeu, la voiture à faire sortir et les voitures obstacles.
	 */
	public RushHour()
	{
		// TODO ne pas confondre variables locales et attributs
		Plateau plateauDePartie = new Plateau();
		VoitureS voitureASortir = new VoitureS();
		plateauDePartie.placerVoitureASortir(voitureASortir);
		plateauDePartie.miseAJourPlateau();
		//VoitureJ voitureDeJeu1 = new VoitureJ();
		//nombreVoitureDansLaPertie++;
	}
	
	/**
	 * Mise en route de la partie de Rush Hour.
	 */
	public void jouer()
	{
		System.out.println("La partie commence.");
	}
}
