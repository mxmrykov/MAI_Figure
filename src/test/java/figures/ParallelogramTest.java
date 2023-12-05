package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelogramTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(0, 1)));
        Parallelogram parallelogramTest1 = new Parallelogram(coordinatesTest1);
        parallelogramTest1.isCoordinatesCorrect();
        boolean resultTest1 = parallelogramTest1.isFigureCorrect;

        Assertions.assertEquals(true, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(-1, 1)));
        Parallelogram parallelogramTest2 = new Parallelogram(coordinatesTest2);
        parallelogramTest2.isCoordinatesCorrect();
        boolean resultTest2 = parallelogramTest2.isFigureCorrect;

        Assertions.assertEquals(false, resultTest2);
    }
}
