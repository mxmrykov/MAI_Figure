import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figyre{
    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public Rectangle(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    private boolean isRectangleCorrect() {
        double lastDist, curDist, added;
        double x = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
        double y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
        lastDist = Math.sqrt(x + y);
        added = lastDist;
        for (int k = 0; k < 4; ++k) { // Перебор точек
            if (k != 3) {
                double X = Math.pow(this.Points.get(k + 1).get(0) - this.Points.get(k).get(0), 2);
                double Y = Math.pow(this.Points.get(k + 1).get(1) - this.Points.get(k).get(1), 2);
                curDist = Math.sqrt(X + Y);
            } else {
                double X = Math.pow(this.Points.get(0).get(0) - this.Points.get(k).get(0), 2);
                double Y = Math.pow(this.Points.get(0).get(1) - this.Points.get(k).get(1), 2);
                curDist = Math.sqrt(X + Y);
            }
            if (curDist != lastDist) {
                added = curDist;
            }
            if (curDist != lastDist && curDist != added && added != lastDist) {
                return false;
            }
            lastDist = curDist;
        }
        return true;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 4 || !isRectangleCorrect()) {
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
            double x = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2);
            double y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2);
            double square = Math.sqrt(X + Y) * Math.sqrt(x + y);
            System.out.printf("The figure area %.2f\n", square);
        }
    }

    @Override
    public void getPerimeter() {
        if (this.isFigureCorrect) {
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
            double Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
            double x = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2);
            double y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2);
            double perimeter = 2 * (Math.sqrt(X + Y) + Math.sqrt(x + y));
            System.out.printf("The figure perimeter %.2f\n", perimeter);
        }
    }
}
