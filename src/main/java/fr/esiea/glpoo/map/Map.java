package fr.esiea.glpoo.map;

import fr.esiea.formes.Forme;

public class Map {
	
	int sizex;
	int sizey;
	
	Nodes mat[][];
	
	public Map(int sizex, int sizey)
	{
		this.sizex = sizex;
		this.sizey = sizey;
		mat = new Nodes [sizex][sizey];
		createMatrixNodes();
	}
	
	void createMatrixNodes()
	{
		for (int i = 0; i < this.mat.length ; i++)
			for(int j = 0; j < this.mat[0].length; j++)// TODO magic number need to be replaced
			{
				//create nodes neighborhood null if none
				//TODO refactor magic number as -1
				mat[i][j] = new Nodes(i+1<this.mat.length ? i+1:-1, j+1<this.mat.length ? j+1:-1, i-1>=0 ? i-1:-1, j-1>=0 ? j-1:-1, i, j);
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
	

}
