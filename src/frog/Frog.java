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
	private Position ad;
	private Case p;

	public Frog(Game newGame){
		game = newGame ;
		//sens = Direction.up;
		p = new Case (game.width/2 , 0);
	}

	public Case getPosition(){
		return  p;
	}

	/*public  Frog(Game game , Case p ,  Direction sens )	{
		this.game = game;
		this.sens = sens;
		this.p=p;*/



	public Direction getDirection() {
		return getDirection();
	}
	public void move(Direction key){
		switch (key) {
			case up:
				p = new Case (p.absc ,p.ord+1);
				break;
			case down:
				p = new Case (p.absc ,p.ord-1);
				break;
			case right:
				p = new Case (p.absc+1 ,p.ord);
				break;
			case left:
				p = new Case (p.absc-1 ,p.ord);		}
	}
}
