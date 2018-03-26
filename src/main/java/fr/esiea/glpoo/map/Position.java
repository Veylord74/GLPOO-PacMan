package fr.esiea.glpoo.map;

public class Position {
	private int positionx;
	private int positiony;
	
	public Position(int x, int y)
	{
		this.positionx = x;
		this.positiony = y;
	}
	
	public int getPositionx()
	{
		return positionx;
	}
	public int getPositiony()
	{
		return positiony;
	}
	public void setPositionx(int x)
	{
		this.positionx = x;
	}
	public void setPositiony(int y)
	{
		this.positiony = y;
	}
}
