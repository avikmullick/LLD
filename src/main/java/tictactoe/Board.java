package tictactoe;

public class Board {
    private final int boardSize;
    private final PlayingPiece[][] board;

    public Board(int boardSize) {
        this.boardSize=boardSize;
        board = new PlayingPiece[boardSize][boardSize];
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void addPiece(PlayingPiece playingPiece, int row, int column) throws ArrayIndexOutOfBoundsException {
        if (row >= boardSize || column >= boardSize) {
            throw new ArrayIndexOutOfBoundsException("Invalid Input");
        }
        board[row][column] = playingPiece;
    }

    public void printBoard(){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                if(board[i][j]!=null) {
                    System.out.print("  " + board[i][j].getPlayingPieceType() + "  |");
                } else{
                    System.out.print("    |");
                }
            }
            System.out.println();
        }
    }
}
