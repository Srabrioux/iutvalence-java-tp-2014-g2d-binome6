package fr.iutvalence.java.tp.rushhour;
/**
 * Description d'une partie de Rush Hour
 * @author rabrious
 * 
 */
public class RushHour
{
	/**
	 * Déclaration du nombre de voiture dans la partie.
	 */
	private int nombreDeVoitures;

	/**
	 * Déclaration de la voiture a sortir.
	 */
	private Voiture voitureASortir;
	
	/**
	 * Déclaration des voitures du jeux.
	 */
	private Voiture voitureDuJeu[];	
	
	/**
	 * Créer le plateau de jeu, la voiture à faire sortir et les voitures obstacles.
	 */
	public RushHour()
	{
		voitureDuJeu[0]= new Voiture();		
		if(nombreDeVoitures == 4)
		{
			voitureDuJeu[1] = new Voiture(0,0,0,0);
			voitureDuJeu[2] = new Voiture(0,0,0,0);
			voitureDuJeu[3] = new Voiture(0,0,0,0);
			voitureDuJeu[4] = new Voiture(0,0,0,0);
		}
		else if(nombreDeVoitures == 5)
		{
			voitureDuJeu[1] = new Voiture(0,0,0,0);
			voitureDuJeu[2] = new Voiture(0,0,0,0);
			voitureDuJeu[3] = new Voiture(0,0,0,0);
			voitureDuJeu[4] = new Voiture(0,0,0,0);
			voitureDuJeu[5] = new Voiture(0,0,0,0);
		}
		else if(nombreDeVoitures == 6)
		{
			voitureDuJeu[1] = new Voiture(0,0,0,0);
			voitureDuJeu[2] = new Voiture(0,0,0,0);
			voitureDuJeu[3] = new Voiture(0,0,0,0);
			voitureDuJeu[4] = new Voiture(0,0,0,0);
			voitureDuJeu[5] = new Voiture(0,0,0,0);
			voitureDuJeu[6] = new Voiture(0,0,0,0);
		}
		else if(nombreDeVoitures == 7)
		{
			voitureDuJeu[1] = new Voiture(0,0,0,0);
			voitureDuJeu[2] = new Voiture(0,0,0,0);
			voitureDuJeu[3] = new Voiture(0,0,0,0);
			voitureDuJeu[4] = new Voiture(0,0,0,0);
			voitureDuJeu[5] = new Voiture(0,0,0,0);
			voitureDuJeu[6] = new Voiture(0,0,0,0);
			voitureDuJeu[7] = new Voiture(0,0,0,0);
		}
		else if(nombreDeVoitures == 8)
		{
			voitureDuJeu[1] = new Voiture(0,0,0,0);
			voitureDuJeu[2] = new Voiture(0,0,0,0);
			voitureDuJeu[3] = new Voiture(0,0,0,0);
			voitureDuJeu[4] = new Voiture(0,0,0,0);
			voitureDuJeu[5] = new Voiture(0,0,0,0);
			voitureDuJeu[6] = new Voiture(0,0,0,0);
			voitureDuJeu[7] = new Voiture(0,0,0,0);
			voitureDuJeu[8] = new Voiture(0,0,0,0);
		}
		this.dessinerGrille();
	}
	
	/**
	 * Mise en route de la partie de Rush Hour.
	 */
	public void jouer()
	{
		//rien pour le moment
	}
	
	public void dessinerGrille()
	{
		System.out.println("  _   _   _   _   _   _   _   _   _  ");
		
		//System.out.println("| " +  + " | " +  + " | " +  + " | " +  + " | " +  + " | " +  + " | " +  + " | " +  + " | " +  + " |");
	}
}
