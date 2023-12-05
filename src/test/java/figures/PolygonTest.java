package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(0, 1)));
        Polygon polygonTest1 = new Polygon(coordinatesTest1);
        polygonTest1.isCoordinatesCorrect();
        boolean resultTest1 = polygonTest1.isFigureCorrect;

        Assertions.assertEquals(true, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1)));
        Polygon polygonTest2 = new Polygon(coordinatesTest2);
        polygonTest2.isCoordinatesCorrect();
        boolean resultTest2 = polygonTest2.isFigureCorrect;

        Assertions.assertEquals(false, resultTest2);

        ArrayList<List<Integer>> coordinatesTest3 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(2, 1)));
        Polygon polygonTest3 = new Polygon(coordinatesTest3);
        polygonTest3.isCoordinatesCorrect();
        boolean resultTest3 = polygonTest3.isFigureCorrect;

        Assertions.assertEquals(false, resultTest3);
    }
}
