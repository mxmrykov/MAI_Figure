package figures;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Figyre {
    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public Circle(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 2 || Points.get(0).equals(Points.get(1))) {
            System.out.println("The figyre is invalid");
            this.isFigureCorrect = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public void getArea() {
        if (this.isFigureCorrect) {
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
            double Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
            double square = this.PI * Math.pow(Math.sqrt(X + Y), 2);
            System.out.printf("The figure area %.2f\n", square);
        }
    }

    @Override
    public void getPerimeter() {
        if (this.isFigureCorrect) {
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
            double Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
            double perimeter = 2.0 * this.PI * Math.sqrt(X + Y);
            System.out.printf("The figure perimeter %.2f\n", perimeter);
        }
    }
}
