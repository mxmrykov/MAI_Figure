package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircleTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1)));
        Circle circleTest1 = new Circle(coordinatesTest1);
        circleTest1.isCoordinatesCorrect();
        boolean resultTest1 = circleTest1.isFigureCorrect;

        Assertions.assertEquals(true, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(0, 0)));
        Circle circleTest2 = new Circle(coordinatesTest2);
        circleTest2.isCoordinatesCorrect();
        boolean resultTest2 = circleTest2.isFigureCorrect;

        Assertions.assertEquals(false, resultTest2);
    }
}
