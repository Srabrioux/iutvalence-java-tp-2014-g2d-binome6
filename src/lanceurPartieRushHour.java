/**
 * @author rabrious
 * Lance la partie
 */
public class lanceurPartieRushHour 
{

	public static void main(String[] a) 
	{
		System.out.println("Je vais créer une nouvelle partie.");
		RushHour rushHourPartie = new RushHour();
		System.out.println("L'objet RushHourPartie a été créé.");
		rushHourPartie.jouer();
		System.out.println("La partie est finis.");
	}
}
