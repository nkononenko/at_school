import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TriangleRectangularTest {
    @Parameterized.Parameter(0)
    public double a;

    @Parameterized.Parameter(1)
    public double b;

    @Parameterized.Parameter(2)
    public double c;

    @Parameterized.Parameter(3)
    public boolean result;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        //почитать про коллекции и массивы
        return Arrays.asList(
                new Object[]{4, 4, 8, false},
                new Object[]{5, 12, 13, true},
                new Object[]{7, 24, 25, true}
        );

    }

    @Test
    public void TriangleMethodShouldCheckThatSumPowOfTwoSidesEqualToPowOfThirdSide() {
        Triangle triangle = new Triangle();
        boolean actual = triangle.is_rectangular(a, b, c);
        assertEquals(result, actual);

    }
}
