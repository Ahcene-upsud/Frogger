
package environment;

import java.util.ArrayList;

import frog.Frog;
import util.Case;
import gameCommons.Game;
import gameCommons.IEnvironment;

public class Environment implements IEnvironment {
	private ArrayList<Lane> allLane = new ArrayList<>();
	private Game game;
	//private Lane myline;


	public Environment(Game game) {
		this.game = game;
		allLane.add( new Lane(game , 0 , 0));
		allLane.add(new Lane(game , game.height , 0));
		for (int i = 1; i < game.height-1; i++) {
			Lane lane = new Lane(game, i);
			allLane.add(lane);
		}
		//allLane.add(new Lane(game , game.height , 0));
	}

	public void update() {
		for (Lane lane : allLane ) {
			lane.update();
		}
	}
	@Override
	public boolean isSafe(Case c) {
		for(Lane lane : allLane){
			if(!(lane.isSafe(c))){
				return false;
			}
		}
		return true;
	}
	@Override
	public boolean isWinningPosition(Case c) {
		if(game.height == c.ord ){
			return true;
		}else {
			return false;
		}
	}





	/*public boolean testVictory(Case e) {
		if (isWinningPosition(e) ){
			return true;
		}
		return false;
	}*/







	//@Override
	//public void update() {

	//}
}