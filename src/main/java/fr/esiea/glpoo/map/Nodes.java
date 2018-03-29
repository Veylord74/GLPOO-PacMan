package fr.esiea.glpoo.map;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.formes.Couleur;
import fr.esiea.glpoo.toolBox.IdGenerator;

public class Nodes {
	
	//voisins	
	private int nodeEast;
	private int nodeSouth;
	private int nodeWest;
	private int nodeNorth;
	
	private int id;
	
	private int posX;
	private int posY;
	
	private Status status;
	
	private Couleur couleur;
	
	private List<Couleur> couleurList;
	//!!!!!! possible magic number -1 for no neighbor
	Nodes(int nodeEast, int nodeSouth, int nodeWest, int nodeNorth, int posX, int posY, int id, Couleur couleur)
	{

		this.nodeEast = nodeEast;
		this.nodeSouth = nodeSouth;
		this.nodeWest = nodeWest;
		this.nodeNorth = nodeNorth;
		
		this.posX = posX;
		this.posY = posY;
		this.id = id;
		
		
		couleurList = new ArrayList<Couleur>();
		couleurList.add(couleur);
		this.couleur = couleurList.get(couleurList.size()-1);

	}
	

	public int getNeighborCount()
	{
		return ((getNodeEast()==-1 ? 0:1) + (getNodeNorth()==-1 ? 0:1  )+ (getNodeSouth()==-1 ? 0:1 )+ (getNodeWest()==-1 ? 0:1));
	}
	
	public int getPosX()
	{
		return posX;
	}
	
	public int getPosY()
	{
		return posY;
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
	
	public void addColor(Couleur color, boolean setColor)
	{
		this.couleurList.add(color);
		if (setColor)
		{
			this.setColor(couleurList.size()-1);
		}
	}
	
	public void setColor(int id)
	{
		this.couleur = couleurList.get(id);
	}
	
	public void setLastColor()
	{
		this.couleur = couleurList.get(couleurList.size()-1);
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
