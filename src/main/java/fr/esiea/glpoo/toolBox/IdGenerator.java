package fr.esiea.glpoo.toolBox;

public final class IdGenerator {
	private int id;
	
	public IdGenerator()
	{
		id = 0;
	}
	
	public int getNextId()
	{
		return id++;
	}
	
}
	

