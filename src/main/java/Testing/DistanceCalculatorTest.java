package Testing;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

import java.util.Arrays;
import java.util.Collection;

    @RunWith(Suite.class)
    @Suite.SuiteClasses({DistanceCalculatorTest.SimpleDistanceCalculationTest.class, DistanceCalculatorTest.AllDistanceCalculationTest.class})
    public class DistanceCalculatorTest {
        // Parameterized test for simple distance calculation
        @RunWith(Parameterized.class)
        public static class SimpleDistanceCalculationTest {
            private final String expression;
            private final double expectedDistance;

            public SimpleDistanceCalculationTest(String expression, double expectedDistance) {
                this.expression = expression;
                this.expectedDistance = expectedDistance;
            }

            @Parameterized.Parameters(name = "{index}: {0} = {1}")
            public static Collection<Object[]> data() {
                return Arrays.asList(new Object[][]{
                        {"10 cm + 1 m - 10 mm", 1090.0},
                        {"5 km - 500 m + 3 dm", 496500.0},
                        {"2 km - 500 m + 300 cm - 5 mm", 1995795.0}
                });
            }

            @Test
            public void testCalculateDistance() {
                double actualDistance = DistanceCalculator.calculateDistance(expression);
                Assert.assertEquals(expectedDistance, actualDistance, 0.0001);
            }
        }

        // Test suite for all distance calculations
        public static class AllDistanceCalculationTest {
            @Test
            public void testCalculateDistance() {
                testExpression("10 cm + 1 m - 10 mm", 1090.0);
                testExpression("5 km - 500 m + 3 dm", 496500.0);
                testExpression("2 km - 500 m + 300 cm - 5 mm", 1995795.0);
            }

            private void testExpression(String expression, double expectedDistance) {
                double actualDistance = DistanceCalculator.calculateDistance(expression);
                Assert.assertEquals(expectedDistance, actualDistance, 0.0001);
            }
        }
    }

}
