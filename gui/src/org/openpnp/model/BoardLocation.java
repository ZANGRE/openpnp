package org.openpnp.model;

import org.openpnp.model.Board.Side;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class BoardLocation {
	@Element
	private Location location;
	@Attribute
	private Side side;
	private Board board;
	
	@Attribute
	private String boardFile;
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	String getBoardFile() {
		return boardFile;
	}
	
	void setBoardFile(String boardFile) {
		this.boardFile = boardFile;
	}

	@Override
	public String toString() {
		return String.format("board (%s), location (%s), side (%s)", boardFile, location, side);
	}
}