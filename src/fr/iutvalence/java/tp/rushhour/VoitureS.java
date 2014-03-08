package fr.iutvalence.java.tp.rushhour;
/**
 * Objet voiture à faire sortir du plateau.
 * @author rabrious
 *
 */
public class VoitureS
{
	// TODO l'attribut ne devrait pas être visible
	// TODO écrire le commentaire
	public int pX;

	// TODO l'attribut ne devrait pas être visible
	// TODO écrire le commentaire
	public int pY;
	
	// TODO l'attribut ne devrait pas être visible
	// TODO écrire le commentaire
	public int styleVehicule;
	
	// TODO l'attribut ne devrait pas être visible
	// TODO écrire le commentaire
	public int sens;
	
	// TODO l'attribut ne devrait pas être visible
	// TODO écrire le commentaire
	public boolean estSortie;
	
	// TODO écrire le commentaire
	public VoitureS()
	{
		this.pX = 2;
		this.pY = 5;
		this.styleVehicule = 1;
		this.sens = 2;
		this.estSortie = false;
	}
	
	// TODO écrire le commentaire
	public void avancer()
	{
		if(this.pX == 6)
		{
			this.pX = this.pX+1;
			this.estSortie = true;
		}
		else
		{
			this.pX = this.pX+1;
		}
	}
	
	// TODO écrire le commentaire
	public void reculer()
	{
		if(this.pX != 2)
		{
			this.pX = this.pX-1;
		}
	}
}