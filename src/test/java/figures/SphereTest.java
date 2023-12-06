package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SphereTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(1, 1, 1)));
        Sphere sphereTest1 = new Sphere(coordinatesTest1);
        sphereTest1.isCoordinatesCorrect();
        boolean resultTest1 = sphereTest1.isFigureCorrect;

        Assertions.assertEquals(true, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(List.of(Arrays.asList(0, 0, 0)));
        Sphere sphereTest2 = new Sphere(coordinatesTest2);
        sphereTest2.isCoordinatesCorrect();
        boolean resultTest2 = sphereTest2.isFigureCorrect;

        Assertions.assertEquals(false, resultTest2);

        ArrayList<List<Integer>> coordinatesTest3 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0)));
        Sphere sphereTest3 = new Sphere(coordinatesTest3);
        sphereTest3.isCoordinatesCorrect();
        boolean resultTest3 = sphereTest3.isFigureCorrect;

        Assertions.assertEquals(false, resultTest3);
    }
}