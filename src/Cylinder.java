import java.util.ArrayList;
import java.util.List;

public class Cylinder extends Figyre{
    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public Cylinder(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 3 || Points.get(0) == Points.get(1) || Points.get(2) == Points.get(1) || Points.get(2) == Points.get(0)) {
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
                    height = Math.sqrt(X + Y + Z), rad = -1;
            for (int i = 0; i < 2; ++i) {
                double vectorX = Math.pow(this.Points.get(2).get(0) - this.Points.get(i).get(0), 2),
                        vectorY = Math.pow(this.Points.get(2).get(1) - this.Points.get(i).get(1), 2),
                        vectorZ = Math.pow(this.Points.get(2).get(2) - this.Points.get(i).get(2), 2),
                        dist = Math.sqrt(vectorX + vectorY + vectorZ);
                if (rad == -1 || rad > dist) {
                    rad = dist;
                }
            }
            double square = PI * Math.pow(rad, 2) * height;
            System.out.printf("The figure area %.2f\n", square);
        }
    }
}
