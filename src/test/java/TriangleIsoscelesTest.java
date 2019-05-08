import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class TriangleIsoscelesTest {

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
                new Object[]{5, -5, 10, false},
                new Object[]{4, 4, 0, true},
                new Object[]{1, 1, 4, true},
                new Object[]{50.50, 50.50, 50.50, false}
        );

    }

    @Test
    public void TriangleMethodShouldCheckThatOnlyTwoSidesEqual() {
        Triangle triangle = new Triangle();
        boolean actual = triangle.is_isosceles(a, b, c);
        assertEquals(result, actual);

    }
}

