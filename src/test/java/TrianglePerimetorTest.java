
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TrianglePerimetorTest {

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
                new Object[]{5, 5.23, 10, 20.23},
                new Object[]{134, 324, 170, 628},
                new Object[]{1, 1, 4, 6},
                new Object[]{3, 3, 4, 10}
        );

    }

    @Test
    public void TriangleMethodShouldSumTriangleSides() {
        Triangle triangle = new Triangle();
        double actual = triangle.perimeter(a, b, c);
        assertEquals(result, actual, 0);

    }
}

