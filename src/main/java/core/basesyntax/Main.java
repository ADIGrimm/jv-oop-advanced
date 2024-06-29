package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[6];
        for (Figure figure : figureArray) {
            figure = figureSupplier.getRandomFigure();
            figure.draw();
        }
    }
}
