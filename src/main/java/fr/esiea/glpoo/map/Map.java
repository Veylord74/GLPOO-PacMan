package fr.esiea.glpoo.map;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.formes.Couleur;
import fr.esiea.formes.Forme;
import fr.esiea.formes.FormeType;
import fr.esiea.formes.SimpleForme;
import fr.esiea.glpoo.toolBox.IdGenerator;

public class Map {
	
	private int sizex;
	private int sizey;
	private IdGenerator idGenerator;
	List<SimpleForme> listFormes;
	//x line
	//y column
		
	Nodes mat[][];
	
	public Map(int sizex, int sizey)
	{
		idGenerator = new IdGenerator();
		listFormes = new ArrayList<SimpleForme>();
		this.sizex = sizex;
		this.sizey = sizey;
		mat = new Nodes [sizex][sizey];
		createMatrixNodes();
	}
	
	void createMatrixNodes()
	{
		for (int x = 0; x < sizex ; x++)
		{
			for(int y = 0; y < sizey; y++)// TODO magic number 0 need to be replaced
			{
				//create nodes neighborhood null if none
				//TODO replace magic number  -1
				
				mat[x][y] = new Nodes((y+1<sizey ? y+(sizex*x)+1:-1), (x+1<sizex ? y+sizex*(x+1):-1), y+(sizex*x)-1, (y+(sizex*x)-sizex < 0 ? -1 : y+(sizex*x)-sizex) ,
						x, y, idGenerator.getNextId(), Couleur.blanc);
			}
		}
	}
	
	public void addForme(int positionx, int positiony, FormeType formeType, int positionx1, int positiony1)
	{
		SimpleForme forme = new SimpleForme(idGenerator.getNextId(), positionx, positiony, formeType, positionx1, positiony1);
		forme.createFormOnMap(this);
		this.listFormes.add(forme);
	}
	
	public void displayMapById()
	{
		for (int x = 0; x< sizex; x++)
		{
			String line = "";
			for (int y = 0; y<sizey; y++)
			{
				line+=mat[x][y].getId();
				line+=" ";
			}
			System.out.println(line);
		}
	}
	
	public void displayMapByNeighbor()
	{
		for (int x = 0; x< sizex; x++)
		{
			String line = "";
			for (int y = 0; y<sizey; y++)
			{
				line+=mat[x][y].getNeighborCount();
				line+=" ";
			}
			System.out.println(line);
		}
	}
	
	public void displayMapByColor()
	{
		for (int x = 0; x< sizex; x++)
		{
			String line = "";
			for (int y = 0; y<sizey; y++)
			{
				line+=mat[x][y].getColor().getAlias();
				line+=" ";
			}
			System.out.println(line);
		}
	}
	
	public Nodes getNodeById(int id)
	{
	for (int i = 0; i< sizex; i++)
		{
			for (int j = 0; j<sizey; j++)
			{
				if (id == mat[i][j].getId())
				{
					return mat[i][j];
				}
			}
		}
		return null;
	}
	
	public Nodes getNodeByPos(int posX, int posY)
	{
		return mat[posX][posY];
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
