package main.java.game;

public class Player {

    private String name;
    private Die[] dice;
    private Board board;
    private Piece pieces;

    public void takeTurn() {
        int fvTot = 0;
        for (Die die : dice) {
            die.roll();
            fvTot += die.getFaceValue();
        }

        Square oldLoc = pieces.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        pieces.setLocation(newLoc);
    }

}
