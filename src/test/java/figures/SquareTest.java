package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(0, 1), Arrays.asList(1, 1), Arrays.asList(1, 0)));
        Square squareTest1 = new Square(coordinatesTest1);
        squareTest1.isCoordinatesCorrect();
        boolean resultTest1 = squareTest1.isFigureCorrect;

        Assertions.assertEquals(true, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(2, 0)));
        Square squareTest2 = new Square(coordinatesTest2);
        squareTest2.isCoordinatesCorrect();
        boolean resultTest2 = squareTest2.isFigureCorrect;

        Assertions.assertEquals(false, resultTest2);

        ArrayList<List<Integer>> coordinatesTest3 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1)));
        Square squareTest3 = new Square(coordinatesTest3);
        squareTest3.isCoordinatesCorrect();
        boolean resultTest3 = squareTest3.isFigureCorrect;

        Assertions.assertEquals(false, resultTest3);
    }
}