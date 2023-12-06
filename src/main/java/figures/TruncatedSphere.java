package figures;

import java.util.ArrayList;
import java.util.List;

public class TruncatedSphere extends Figyre {

    public ArrayList<List<Integer>> Points;
    public boolean isFigureCorrect = true;

    public TruncatedSphere(ArrayList<List<Integer>> coordinates) {
        this.Points = coordinates;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() == 3 && Points.get(0).size() == 3 && Points.get(1).size() == 3 && Points.get(2).size() == 3) {
            int vectorXFirst = Points.get(1).get(0) - Points.get(0).get(0),
                    vectorYFirst = Points.get(1).get(1) - Points.get(0).get(1),
                    vectorZFirst = Points.get(1).get(2) - Points.get(0).get(2),
                    vectorXSecond = Points.get(2).get(0) - Points.get(0).get(0),
                    vectorYSecond = Points.get(2).get(1) - Points.get(0).get(1),
                    vectorZSecond = Points.get(2).get(2) - Points.get(0).get(2);
            double radius = Math.sqrt(Math.pow(vectorXFirst, 2) + Math.pow(vectorYFirst, 2) + Math.pow(vectorZFirst, 2)),
                    height = Math.sqrt(Math.pow(vectorXSecond, 2) + Math.pow(vectorYSecond, 2) + Math.pow(vectorZSecond, 2));
            if (radius == height && radius > 0) {
                System.out.println("The figyre is invalid");
                isFigureCorrect = false;
            } else {
                System.out.println("The figure is valid");
            }
        } else {
            System.out.println("The figyre is invalid");
            isFigureCorrect = false;
        }
    }

    @Override
    public void getArea() {
        if (!isFigureCorrect) {
            return;
        }
        int vectorXFirst = Points.get(1).get(0) - Points.get(0).get(0),
                vectorYFirst = Points.get(1).get(1) - Points.get(0).get(1),
                vectorZFirst = Points.get(1).get(2) - Points.get(0).get(2);
        double radius = Math.sqrt(Math.pow(vectorXFirst, 2) + Math.pow(vectorYFirst, 2) + Math.pow(vectorZFirst, 2));
        double heightFirst = Math.abs(Points.get(0).get(2) - Points.get(2).get(2)),
                heightSecond = radius - heightFirst;
        double squareFirst = 2 * Math.PI * heightSecond * radius,
                squareSecond = 4 * Math.PI * Math.pow(radius, 2),
                squareThird = Math.PI * (Math.pow(radius, 2) - Math.pow(heightFirst, 2)),
                square = squareSecond - squareFirst + squareThird;
        System.out.printf("The figure area %.2f\n", square);
    }
}