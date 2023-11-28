package figures;

import java.util.ArrayList;
import java.util.List;

public class Sphere extends Figyre {
    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public Sphere(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 2 || Points.get(0) == Points.get(1)) {
            System.out.println("The figyre is invalid");
            this.isFigureCorrect = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public void getArea() {
        if (isFigureCorrect) {
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2),
                    Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2),
                    Z = Math.pow(this.Points.get(1).get(2) - this.Points.get(0).get(2), 2),
                    square = 4.0 * this.PI * Math.pow(Math.sqrt(X + Y + Z), 2);
            System.out.printf("The figure area %.2f\n", square);
        }
    }

    @Override
    public void getPerimeter() {
        if (isFigureCorrect) {
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2),
                    Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2),
                    Z = Math.pow(this.Points.get(1).get(2) - this.Points.get(0).get(2), 2),
                    perimeter = 2.0 * this.PI * Math.sqrt(X + Y + Z);
            System.out.printf("The figure perimter %.2f\n", perimeter);
        }
    }
}
