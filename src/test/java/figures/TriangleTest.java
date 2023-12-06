package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangleTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 0)));
        Triangle triangleTest1 = new Triangle(coordinatesTest1);
        triangleTest1.isCoordinatesCorrect();
        boolean resultTest1 = triangleTest1.isFigureCorrect;

        Assertions.assertEquals(true, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(2, 0)));
        Triangle triangleTest2 = new Triangle(coordinatesTest2);
        triangleTest2.isCoordinatesCorrect();
        boolean resultTest2 = triangleTest2.isFigureCorrect;

        Assertions.assertEquals(false, resultTest2);

        ArrayList<List<Integer>> coordinatesTest3 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 2)));
        Triangle triangleTest3 = new Triangle(coordinatesTest3);
        triangleTest3.isCoordinatesCorrect();
        boolean resultTest3 = triangleTest3.isFigureCorrect;

        Assertions.assertEquals(false, resultTest3);
    }
}