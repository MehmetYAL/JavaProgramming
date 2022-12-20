package day40_FinalKeyword;

import day39_Recap_Encaps_Inher.shapeTAsk.Circle;
import day39_Recap_Encaps_Inher.shapeTAsk.Square;

public class EncaspsulationReview {
    private Circle circle;
    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle) {
        if (circle.getRadius()<5){
            return;
        }
        this.circle = circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
