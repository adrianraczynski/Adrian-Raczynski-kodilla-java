package com.kodilla.testing.shape;

        import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList <Shape> figureShape = new ArrayList <Shape>();



    public void addFigure (Shape shape){
        figureShape.add (shape);
    }

    public boolean removeFigure (Shape shape){

        return figureShape.remove(shape);
    }

    public Shape getFigure (int n){
        return figureShape.get(n);
    }

    public ArrayList<Shape> showFigures (){
        return figureShape;
    }
}
