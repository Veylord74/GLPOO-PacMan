package fr.esiea.glpoo.map;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.formes.Couleur;
import fr.esiea.formes.Forme;
import fr.esiea.formes.FormeType;
import fr.esiea.formes.Polynomes;
import fr.esiea.formes.SimpleForme;
import fr.esiea.glpoo.toolBox.IdGenerator;

public class Map {
	
	private int sizex;
	private int sizey;
	private IdGenerator idGenerator;
	List<Forme> listFormes;
	//x abscisse croissant 
	//y ordonné décroissant
		
	Nodes mat[][];
	
	public Map(int sizex, int sizey)
	{
		idGenerator = new IdGenerator();
		listFormes = new ArrayList<Forme>();
		this.sizex = sizex;
		this.sizey = sizey;
		mat = new Nodes [sizey][sizex];
		createMatrixNodes();
	}
	
	void createMatrixNodes()
	{
		for (int y = 0; y < sizex ; y++)
		{
			for(int x = 0; x < sizey; x++)// TODO magic number 0 need to be replaced
			{
				//create nodes neighborhood null if none
				//TODO replace magic number  -1
				
				mat[y][x] = new Nodes((x+1<sizex ? x+(sizey*y)+1:-1), (y+1<sizey ? x+sizey*(y+1):-1), x+(sizey*y)-1, (x+(sizey*y)-sizey < 0 ? -1 : x+(sizex*y)-sizey) ,
						y, x, idGenerator.getNextId(), Couleur.blanc);
			}
		}
	}
	
	public void addFormeSimple(int positionx, int positiony, FormeType formeType, int positionx1, int positiony1)
	{
		SimpleForme forme = new SimpleForme(idGenerator.getNextId(), positionx, positiony, formeType, positionx1, positiony1);
		forme.createFormOnMap(this);
		this.listFormes.add(forme);
	}
	
	public void addPolygone(List<Position> posList)
	{
		Polynomes forme = new Polynomes(posList);
		forme.createFormOnMap(this);
		this.listFormes.add(forme);
	}
	
	
	public void displayMapById()
	{
		for (int y = 0; y< sizex; y++)
		{
			String line = "";
			for (int x = 0; x<sizey; x++)
			{
				line+=mat[y][x].getId();
				line+=" ";
			}
			System.out.println(line);
		}
	}
	
	public void displayMapByNeighbor()
	{
		for (int y = 0; y< sizex; y++)
		{
			String line = "";
			for (int x = 0; x<sizey; x++)
			{
				line+=mat[y][x].getNeighborCount();
				line+=" ";
			}
			System.out.println(line);
		}
	}
	
	public void displayMapByColor()
	{
		for (int y = 0; y< sizey; y++)
		{
			String line = "";
			for (int x = 0; x<sizex; x++)
			{
				line+=mat[y][x].getColor().getAlias();
				line+=" ";
			}
			System.out.println(line);
		}
	}
	
	public Nodes getNodeById(int id)
	{
	for (int y = 0; y< sizex; y++)
		{
			for (int x = 0; x<sizey; x++)
			{
				if (id == mat[y][x].getId())
				{
					return mat[y][x];
				}
			}
		}
		return null;
	}
	
	public boolean existingNode(int y, int x)
	{
		if(this.getNodeByPos(y, x)!=null)
		{
			return true;
		}
		return false;
	}
	
	public boolean existingNode(int id)
	{
		if (this.getNodeById(id)!=null)
		{
			return true;
		}
		return false;
	}
	
	public Nodes getNodeByPos(int posY, int posX)
	{
		if (posX >= this.getSizex() || posY >=this.getSizey() || posY < 0 || posX < 0)
		{
			return null;
		}
		return mat[posY][posX];
	}
	
	public Nodes[][] getMat()
	{
		return this.mat;
	}
	
	public int getSizex()
	{
		return sizex;
	}
	
	public int getSizey()
	{
		return sizey;
	}


}
