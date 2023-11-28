package figures;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Figyre {
    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public Polygon(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    private boolean isPolygonCorrect() {
        for (int i = 0; i < Points.size() - 1; ++i) {
            if (Points.get(i) == Points.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (!isPolygonCorrect()) {
            System.out.println("The figyre is invalid");
            this.isFigureCorrect = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public void getArea() {
        if (isFigureCorrect) {
            double firstSum = 0, secSum = 0;
            for (int i = 0; i < Points.size() - 1; ++i) {
                firstSum += Points.get(i).get(0) * Points.get(i + 1).get(1);
                secSum += Points.get(i + 1).get(0) * Points.get(i).get(1);
            }
            double square = 0.5 * Math.abs(firstSum +
                    Points.get(Points.size() - 1).get(0) * Points.get(0).get(1)
                    - secSum - Points.get(0).get(0) * Points.get(Points.size() - 1).get(1));
            System.out.printf("The figure area %.2f\n", square);
        }
    }

    @Override
    public void getPerimeter() {
        if (isFigureCorrect) {
            double perimeter = 0;
            for (int k = 0; k < Points.size() - 1; ++k) {
                double X = Math.pow(this.Points.get(k + 1).get(0) - this.Points.get(k).get(0), 2),
                        Y = Math.pow(this.Points.get(k + 1).get(1) - this.Points.get(k).get(1), 2),
                        sideSize = Math.sqrt(X + Y);
                perimeter += sideSize;
            }
            double X = Math.pow(this.Points.get(0).get(0) - this.Points.get(Points.size() - 1).get(0), 2),
                    Y = Math.pow(this.Points.get(0).get(1) - this.Points.get(Points.size() - 1).get(1), 2),
                    sideSize = Math.sqrt(X + Y);
            perimeter += sideSize;
            System.out.printf("The figure perimeter %.2f\n", perimeter);
        }
    }
}
