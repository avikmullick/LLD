package tictactoe;

public class PlayingPiece {
    private final EnumPlayingPieceType playingPieceType;

    PlayingPiece(EnumPlayingPieceType playingPieceType){
        this.playingPieceType=playingPieceType;
    }

    public EnumPlayingPieceType getPlayingPieceType() {
        return playingPieceType;
    }
}
