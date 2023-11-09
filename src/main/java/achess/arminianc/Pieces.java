package achess.arminianc;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Pieces {


    /*public static boolean validMove(char[][] boardPosi, int fromX, int fromY, int toX, int toY){

        switch (boardPosi[fromX][fromY]){
            case 'K':
            case 'k':
                if(Math.abs(fromX-toX) <= 1 && Math.abs(fromY-toY) <= 1){
                    return true;
                }else{
                    return false;
                }
            case 'Q':
            case 'q':
                if(fromX - toX == 0 || fromY - toY == 0 || Math.abs(fromX-toX) == Math.abs(fromY-toY)) {
                    return true;
                }else{
                    return false;
                }
            case 'B':
            case 'b':
                if(Math.abs(fromX-toX) == Math.abs(fromY-toY)){
                    return true;
                }else{
                    return false;
                }
            case 'R':
            case 'r':
                if(fromX - toX == 0 || fromY - toY == 0){
                    return true;
                }else{
                    return false;
                }
            case 'N':
            case 'n':
                if(Math.abs(fromX-toX) == 2 && Math.abs(fromY-toY) == 1 || Math.abs(fromX-toX) == 1 && Math.abs(fromY-toY) == 2) {
                    return true;
                }
                break;
            case 'P':
                if(fromY == 6){
                    if(fromY - toY == 1 || fromY - toY == 2) {
                        return true;
                    }
                }
                if(fromY == 5){
                    if(fromY - toY == 1) {
                        return true;
                    }
                }
                break;
            case 'p':
                if(fromY == 1){
                    if(fromY - toY == 1 || fromY - toY == 2) {
                        return true;
                    }
                }
                if(fromY == 2){
                    if(fromY - toY == 1) {
                        return true;
                    }
                }
                break;
            default:
                return false;
        }
        return false;
    }*/

    private static String c = "achess/arminianc/";

    public static Image pieceImage(char para){

        Image whichPiece = null;

        //use resrouce loader
        //getClass().getResource("/images/your_image.png").toExternalForm());

        switch (para) {
            case 'k' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/bK.png").toExternalForm());
            case 'q' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/bQ.png").toExternalForm());
            case 'b' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/bB.png").toExternalForm());
            case 'n' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/bN.png").toExternalForm());
            case 'r' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/bR.png").toExternalForm());
            case 'p' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/bP.png").toExternalForm());
            case 'K' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/wK.png").toExternalForm());
            case 'Q' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/wQ.png").toExternalForm());
            case 'B' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/wB.png").toExternalForm());
            case 'N' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/wN.png").toExternalForm());
            case 'R' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/wR.png").toExternalForm());
            case 'P' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/wP.png").toExternalForm());
            case 'i' -> whichPiece = new Image(Pieces.class.getResource("/achess/arminianc/icois/iconC.png").toExternalForm());
        }

        if(whichPiece == null){
            whichPiece = new Image("icois/iconC.png");
        }

        return whichPiece;
    }
}
