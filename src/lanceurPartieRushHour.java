/**
 * @author rabrious
 * Lance la partie
 */
public class lanceurPartieRushHour 
{

	public static void main(String[] a) 
	{
		System.out.println("Je vais cr�er une nouvelle partie.");
		RushHour rushHourPartie = new RushHour();
		System.out.println("L'objet RushHourPartie a �t� cr��.");
		rushHourPartie.jouer();
		System.out.println("La partie est finis.");
	}
}
