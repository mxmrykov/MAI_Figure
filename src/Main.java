import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputCommand = scan.nextLine();
        boolean flag = true;
        do {
            switch (inputCommand.trim()) {
                case "FIGURE":
                    Figyre figure = new Figyre();
                    figure.isCoordinatesCorrect();
                    figure.getArea();
                    figure.getPerimeter();
                case "CIRCLE":
                    ArrayList<List<Integer>> Coordinates = getCoordinates();
                    if (Coordinates.size() != 2) {
                        System.out.println("Please, retype");
                    } else {
                        Circle circle = new Circle(Coordinates);
                        circle.isCoordinatesCorrect();
                        circle.getArea();
                        circle.getPerimeter();
                    }
                case "SQUARE":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() != 4) {
                        System.out.println("Please, retype");
                    } else {
                        Square square = new Square(Coordinates);
                        square.isCoordinatesCorrect();
                        square.getArea();
                        square.getPerimeter();
                    }
                case "RECTANGLE":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() != 4) {
                        System.out.println("Please, retype");
                    } else {
                        Rectangle rectangle = new Rectangle(Coordinates);
                        rectangle.isCoordinatesCorrect();
                        rectangle.getArea();
                        rectangle.getPerimeter();
                    }
                case "PARALLELOGRAM":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() != 4) {
                        System.out.println("Please, retype");
                    } else {
                        Parallelogram parallelogram = new Parallelogram(Coordinates);
                        parallelogram.isCoordinatesCorrect();
                        parallelogram.getArea();
                        parallelogram.getPerimeter();
                    }
                case "TRIANGLE":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() != 3) {
                        System.out.println("Please, retype");
                    } else {
                        Triangle triangle = new Triangle(Coordinates);
                        triangle.isCoordinatesCorrect();
                        triangle.getArea();
                        triangle.getPerimeter();
                    }
                case "POLYGON":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() < 3) {
                        System.out.println("Please, retype");
                    } else {
                        Polygon polygon = new Polygon(Coordinates);
                        polygon.isCoordinatesCorrect();
                        polygon.getArea();
                        polygon.getPerimeter();
                    }
                case "SPHERE":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() != 2) {
                        System.out.println("Please, retype");
                    } else {
                        Sphere sphere = new Sphere(Coordinates);
                        sphere.isCoordinatesCorrect();
                        sphere.getArea();
                        sphere.getPerimeter();
                    }
                case "CYLINDER":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() != 3) {
                        System.out.println("Please, retype");
                    } else {
                        Cylinder cylinder = new Cylinder(Coordinates);
                        cylinder.isCoordinatesCorrect();
                        cylinder.getArea();
                        cylinder.getPerimeter();
                    }
                case "CONE":
                    Coordinates = getCoordinates();
                    if (Coordinates.size() != 3) {
                        System.out.println("Please, retype");
                    } else {
                        Cone cone = new Cone(Coordinates);
                        cone.isCoordinatesCorrect();
                        cone.getArea();
                        cone.getPerimeter();
                    }
                case "END":
                    flag = false;
                default:
                    System.out.println("Please, retype");
            }
            inputCommand = scan.nextLine();
        } while (flag);
    }

    public static ArrayList<List<Integer>> getCoordinates() {
        ArrayList<List<Integer>> Coordinates = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        do {
            String input = scan.nextLine();
            List<Integer> currentPoint = new ArrayList<Integer>();
            if (input.equals("STOP_INPUT")) {
                break;
            } else {
                Pattern coordinatesCorrect = Pattern.compile("^[-0-9]*[ ][-0-9]*$|^[-0-9]*[ ][-0-9]*[ ][-0-9]*$");
                Matcher m = coordinatesCorrect.matcher(input);
                if (m.find()) {
                    for (int k = 0; k < input.split("[ ]").length; ++k) {
                        currentPoint.add(Integer.parseInt(input.split("[ ]")[k]));
                    }
                } else {
                    System.out.println("Please, retype");
                }
            }
            Coordinates.add(currentPoint);
        } while (true);
        return Coordinates;
    }
}
