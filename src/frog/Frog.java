package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import graphicalElements.Element;
import util.Case;
import graphicalElements.FroggerGraphic;
import util.Direction;

import javax.swing.text.Position;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.awt.event.KeyListener;

public class Frog implements IFrog   {
	private Game game;
	private Direction sens;
	private String ad;
	private Case p;

	public Frog(Game newGame){
		game = newGame ;
		sens = Direction.up;
		p = new Case (game.width/2 , game.height );
}


/*public  Frog(Game game , Case p ,  Direction sens )	{
	this.game = game;
	this.sens = sens;
	this.p=p;*/

}

	public Case deplacementFrog(Case p){
			getPosition();
}
public void move(Direction key){
	switch (key) {
		case Direction.up:
			p.ord+1.getDirection();
			break;
		case Direction.down:
			p.ord-1.getDirection();
			break;
		case Direction.right:
			p.absc-1.getDirection();
			break;
		case Direction.left:
			p.absc+1.getDirection();
	}
}

}
