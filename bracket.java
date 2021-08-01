
import java.io.*;
import java.util.*;

//creates a datastructure representive of a bracket.

public class bracket {

	//These list will included in the creation of the bracket
	private static ArrayList<game_node> roundN64;
	private static ArrayList<game_node> roundE64;
	private static ArrayList<game_node> roundS64;
	private static ArrayList<game_node> roundW64;

	//These list will be based on the results of the previous round
	private static ArrayList<game_node> roundN32;
	private static ArrayList<game_node> roundE32;
	private static ArrayList<game_node> roundS32;
	private static ArrayList<game_node> roundW32;

	private static ArrayList<game_node> roundN16;
	private static ArrayList<game_node> roundE16;
	private static ArrayList<game_node> roundS16;
	private static ArrayList<game_node> roundW16;

	//Everything below will be only
	private static game_node roundN8;
	private static game_node roundE8;
	private static game_node roundS8;
	private static game_node roundW8;

	private static game_node final_four1;
	private static game_node final_four2;

	//championship
	private static game_node championship;

	//current round 
	private static int curr;

	//when a new bracket is created,
	public bracket(ArrayList<game_node> North, ArrayList<game_node> East, ArrayList<game_node> South, ArrayList<game_node> West ){
		roundN64 = North;
		roundE64 = East;
		roundS64 = South;
		roundW64 = West;
		curr = 0;
	}

	//updates the bracket based on the order of the array list
	public void update(){
		if ( cur == 0 ){
			cur = 1;
		}
		if ( cur == 1 ){
			cur = 2;
		}
		if ( cur == 2){
			cur = 3;
		}
		if ( cur == 3){
			cur == 4;
		}
		if ( cur == 4){
			cur == 5;
		}

	}
	//returns a Map of the winner and their seeds.
	public void iterator(ArrayList<game_node> round){

		Map<Integer,String> myMap = new HashMap<Integer,String>();

		for (game_node temp : round){

			
		}

	}


}