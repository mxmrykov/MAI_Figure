package figures;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Figyre {
    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public Triangle(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    private boolean isBetween(List<Integer> point1, List<Integer> point2, List<Integer> currentPoint) {
        int x1 = point1.get(0);
        int y1 = point1.get(1);
        int x2 = point2.get(0);
        int y2 = point2.get(1);
        int x = currentPoint.get(0);
        int y = currentPoint.get(1);

        return (x > Math.min(x1, x2) && x < Math.max(x1, x2) && y > Math.min(y1, y2) && y < Math.max(y1, y2));
    }

    private boolean isTriangleCorrect() {
        boolean flagFirst, flagSecond, flagThird;
        flagFirst = !isBetween(Points.get(1), Points.get(2), Points.get(0));
        flagSecond = !isBetween(Points.get(0), Points.get(2), Points.get(1));
        flagThird = !isBetween(Points.get(0), Points.get(2), Points.get(2));
        return flagFirst && flagSecond && flagThird;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 3 || !isTriangleCorrect()) {
            System.out.println("The figyre is invalid");
            this.isFigureCorrect = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public void getArea() {
        double firstVectorX = Points.get(1).get(0) - Points.get(0).get(0),
                firstVectorY = Points.get(1).get(1) - Points.get(0).get(1),
                secondVectorX = Points.get(2).get(0) - Points.get(1).get(0),
                secondVectorY = Points.get(2).get(1) - Points.get(1).get(1),
                chiclitel = Math.abs(firstVectorX * secondVectorX + firstVectorY * secondVectorY),
                znamenatel = Math.sqrt(Math.pow(firstVectorX, 2) + Math.pow(firstVectorY, 2))
                        * Math.sqrt(Math.pow(secondVectorX, 2) + Math.pow(secondVectorY, 2));
        double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
        double Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
        double x = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2);
        double y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2);
        double square = Math.sqrt(X + Y) * Math.sqrt(x + y) * (chiclitel / znamenatel);
        System.out.printf("The figure area %.2f\n", square);
    }

    @Override
    public void getPerimeter() {
        double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2),
                Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2),
                x = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2),
                y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2),
                xx = Math.pow(this.Points.get(0).get(0) - this.Points.get(2).get(0), 2),
                yy = Math.pow(this.Points.get(0).get(1) - this.Points.get(2).get(1), 2),
                perimeter = Math.sqrt(X + Y) + Math.sqrt(x + y) + Math.sqrt(xx + yy);
        System.out.printf("The figure perimeter %.2f\n", perimeter);
    }
}
