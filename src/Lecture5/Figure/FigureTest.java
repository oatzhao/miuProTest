package Lecture5.Figure;

public class FigureTest {
    public static void main(String[] args){
        UpwardHat upwardHat0 = new UpwardHat();
        UpwardHat upwardHat1 = new UpwardHat();
        DownwardHat downwardHat = new DownwardHat();
        FaceMaker faceMaker = new FaceMaker();
        Vertical vertical = new Vertical();

        Figure[] figures = new Figure[5];

        figures[0] = upwardHat0;
        figures[1] = upwardHat1;
        figures[2] = downwardHat;
        figures[3] = faceMaker;
        figures[4] = vertical;

        for(Figure figure: figures){
            figure.getFigure();
        }
    }
}
