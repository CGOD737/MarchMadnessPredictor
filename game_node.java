//Written by Christopher Godfrey

//A class designating each specific game which be a part of the bracket.
//The class will be made up of two strings, which will be the resulting seeds of the game.
//The other will store the winner of that game after calculated in the predictor.

import java.io.*;
import java.util.*;

public class game_node {

	//independent variable
	private static String lSeed;
	private static String hSeed;

	//dependent variable
	private static String winner;

	public game_node( String lSeed, String hSeed ) { //intial class constructor
		lSeed = lSeed;
		hSeed = hSeed;
	}

	public void setWinner( String wSeed ){ // sets the winner of that particular game
		
		if ( wSeed != lSeed || wSeed != hSeed)
			System.out.println("Winning Seed does not match either team in the game");
		else
			winner = wSeed;
	}

}