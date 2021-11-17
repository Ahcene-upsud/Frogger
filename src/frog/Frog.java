package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import graphicalElements.Element;
import util.Case;
import graphicalElements.FroggerGraphic;

import javax.swing.text.Position;
import java.awt.*;
import java.security.Key;

public class Frog implements IFrog   {
	private Game game;
	private IFrog myFrog;
	private Direction sens;

	enum Direction sens;


public void Frog(Game game , IFrog myFrog , Direction sens )	{
	this.game = game;
	this.myFrog=myFrog;
	this.sens = sens ;

}

public void frogInGame(IFrog myFrog) {
	this.myFrog=myFrog;

}


}
