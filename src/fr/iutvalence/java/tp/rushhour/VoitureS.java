package fr.iutvalence.java.tp.rushhour;
/**
 * Objet voiture à faire sortir du plateau.
 * @author rabrious
 *
 */
// TODO (done) respecter les conventions d'écriture
public class VoitureS
{
	public int pX;
	public int pY;
	public int styleVehicule;
	public int sens;
	public boolean estSortie;
	
	public VoitureS()
	{
		this.pX = 2;
		this.pY = 5;
		this.styleVehicule = 1;
		this.sens = 2;
		this.estSortie = false;
	}
	
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
	
	public void reculer()
	{
		if(this.pX != 2)
		{
			this.pX = this.pX-1;
		}
	}
}