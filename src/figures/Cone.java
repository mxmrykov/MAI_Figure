package figures;

import java.util.ArrayList;
import java.util.List;

public class Cone extends Figyre {
    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public Cone(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 3 || Points.get(0) == Points.get(1) || Points.get(2) == Points.get(0)) {
            System.out.println("The figyre is invalid");
            this.isFigureCorrect = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public void getArea() {
        if (isFigureCorrect) {
            double X = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2),
                    Y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2),
                    Z = Math.pow(this.Points.get(2).get(2) - this.Points.get(1).get(2), 2),
                    l = Math.sqrt(X + Y + Z);
            double vecX = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2),
                    vecY = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2),
                    vecZ = Math.pow(this.Points.get(1).get(2) - this.Points.get(0).get(2), 2),
                    radius = Math.sqrt(vecX + vecY + vecZ), square = PI * radius * l + PI * Math.pow(radius, 2);
            System.out.printf("The figure area %.2f\n", square);
        }
    }
}
