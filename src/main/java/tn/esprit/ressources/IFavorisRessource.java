package tn.esprit.ressources;

import java.util.List;

import tn.epsrit.entities.Favoris;

public interface IFavorisRessource {

	public List <Favoris> getAllFavoris();
	
	public Favoris getBookFavoris(int Ref , int id);
	
	public Favoris searchfavoris(int Ref);

	
}
