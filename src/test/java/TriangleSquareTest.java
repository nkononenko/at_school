import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TriangleSquareTest {


    @Parameterized.Parameter(0)
    public double a;

    @Parameterized.Parameter(1)
    public double b;

    @Parameterized.Parameter(2)
    public double c;

    @Parameterized.Parameter(3)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        //почитать про коллекции и массивы
        return Arrays.asList(
                new Object[]{6, 5.25, 10, 241.51863282156927},
                new Object[]{3, 4, 5, 77.76888838089432},
                new Object[]{3, 3, 4, 54.22176684690383}
        );

    }

    @Test
    public void TriangleMethodShouldCheckSides() {
        Triangle triangle = new Triangle();
        double actual = triangle.square(a, b, c);
        assertEquals(result, actual, 0);

    }
}
