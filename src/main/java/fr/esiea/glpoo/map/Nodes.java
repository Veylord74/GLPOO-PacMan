package fr.esiea.glpoo.map;

import fr.esiea.formes.Couleur;
import fr.esiea.glpoo.toolBox.IdGenerator;

public class Nodes {
	
	//voisins
	private static IdGenerator idGenerator = new IdGenerator();
	
	
	private int nodeEast;
	private int nodeSouth;
	private int nodeWest;
	private int nodeNorth;
	
	private int id;
	
	private int posX;
	private int posY;
	
	private Status status;
	
	private Couleur couleur;
	//!!!!!! possible magic number -1 for no neighbor
	Nodes(int nodesEast, int nodeSouth, int nodeWest, int nodeNorth, int posX, int posY)
	{
		this.nodeEast = nodeEast;
		this.nodeSouth = nodeSouth;
		this.nodeWest = nodeWest;
		this.nodeNorth = nodeNorth;
		
		this.posX = posX;
		this.posY = posY;
		this.id = idGenerator.getNextId();
	}
	
	public int getNodeEast()
	{
		return nodeEast;
	}
	
	public int getNodeWest()
	{
		return nodeWest;
	}
	
	public int getNodeSouth()
	{
		return nodeSouth;
	}
	
	public int getNodeNorth()
	{
		return nodeNorth;
	}
	
	public Couleur getColor()
	{
		return couleur;
	}
	
	public Status getStatus()
	{
		return status;
	}
	
	public int getId()
	{
		return id;
	}
	
}
