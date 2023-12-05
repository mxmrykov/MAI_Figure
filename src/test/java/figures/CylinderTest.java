package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CylinderTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 1) , Arrays.asList(2, 2, 1)));
        Cylinder cylinderTest1 = new Cylinder(coordinatesTest1);
        cylinderTest1.isCoordinatesCorrect();
        boolean resultTest1 = cylinderTest1.isFigureCorrect;

        Assertions.assertEquals(true, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 1) , Arrays.asList(2, 2, 2)));
        Cylinder cylinderTest2 = new Cylinder(coordinatesTest2);
        cylinderTest2.isCoordinatesCorrect();
        boolean resultTest2 = cylinderTest2.isFigureCorrect;

        Assertions.assertEquals(false, resultTest2);
    }
}
