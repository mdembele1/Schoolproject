import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Board  {

	//public static void main(String[] args) {
		

		
			
			public static final int EMPTY	= 0;
			public static final int PAWN	= 1;
			public static final int KNIGHT	= 2;
			public static final int BISHOP	= 3;
			public static final int ROOK	= 4;
			public static final int QUEEN	= 5;
			public static final int KING	= 6;
			
			public static final String FEN_TRANSLATE = "kqrbnp PNBRQK";
			
			private int[][] whiteBoard, blackBoard;
			private boolean whiteMove;
			
			public Board(String fen) {
				whiteMove = true;
				whiteBoard = new int[8][8];
				blackBoard = new int[8][8];
				String[] fenSplit = fen.split(" ");
				String[] fenBoard = fenSplit[0].split("/");
				for(int row = 0; row < 8; row++) {
					String rowS = fenBoard[row];
					for(int pos = 0, col = 0; col < 8; col++, pos++) {
						if(rowS.charAt(pos) < '9')
							col += rowS.charAt(pos) - '1';
						else {
							int let = FEN_TRANSLATE.indexOf(rowS.charAt(pos)) - 6;
							whiteBoard[row][col] = let;
							blackBoard[7 - row][7 - col] = -let;
						}
					}
				}
			}
			
			public void makeMove(String move) {
				char[] mArr = move.toCharArray();
				int sR = mArr[0] - '0', sC = mArr[1] - '0';
				int eR = mArr[2] - '0', eC = mArr[3] - '0';
				int piece = (whiteMove ? 1 : -1) * (mArr[4] - '0');
				whiteBoard[sR][sC] = EMPTY;
				blackBoard[7 - sR][7 - sC] = EMPTY;
				whiteBoard[eR][eC] = piece;
				blackBoard[7 - eR][7 - eC] = -piece;
				whiteMove = !whiteMove;
			}
			
			public void undoMove(String move) {
				char[] mArr = move.toCharArray();
				int sR = mArr[0] - '0', sC = mArr[1] - '0';
				int eR = mArr[2] - '0', eC = mArr[3] - '0';
				int piece = (whiteMove ? 1 : -1) * (mArr[4] - '0');
				int taken = (whiteMove ? -1 : 1) * (mArr[5] - '0');
				whiteBoard[sR][sC] = piece;
				blackBoard[7 - sR][7 - sC] = -piece;
				whiteBoard[eR][eC] = taken;
				blackBoard[7 - eR][7 - eC] = -taken;
				whiteMove = !whiteMove;
			}
			
			public ArrayList<String> getAllMoves() {
				ArrayList<String> moveList = new ArrayList<String>();
				int[][] board = whiteMove ? whiteBoard : blackBoard;
				
				for(int r = 0; r < 8; r++) {
					for(int c = 0; c < 8; c++) {
						switch(board[r][c]) {
						case 1:
							addPawnMoves(r, c, board, moveList);
							break;
						case 2:
							break;
						}
					}
				}
				return moveList;
			}
			
			private void addPawnMoves(int row, int col, int[][] board, ArrayList<String> moveList) {
				if(row == 6 && board[row - 1][col] == EMPTY) {
					moveList.add(row + "" + col + "" + (row - 1) + "" + col + "" + PAWN + "0");
					if(board[row - 2][col] == EMPTY)
						moveList.add(row + "" + col + "" + (row - 2) + "" + col + "" + PAWN + "0");
				}
			}
			
			private void makeMoveString(int sR, int sC, int eR, int eC, int piece, int taken) {
				
			}
			
			public String toString() {
				StringBuilder boardRep = new StringBuilder();
				for(int r = 0; r < 8; r++) {
					boardRep.append(8 - r + "|");
					for(int c = 0; c < 8; c++)
						boardRep.append(FEN_TRANSLATE.charAt(whiteBoard[r][c] + 6) + "|");
					boardRep.append("\n");
				}
				boardRep.append("  A B C D E F G H");
				return boardRep.toString();
			}
			
			public static void main(String[] args) {
				Board b = new Board("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
				System.out.println(b.getAllMoves());
				b.makeMove("605010");
				System.out.println(b.getAllMoves());
				System.out.println(b);
			}
			
		
	

}
