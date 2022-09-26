package Task3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayChallengeTest {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


        /** @Test
        public void testTotal() {
        int actual = Hw4.total(array);
        Assert.assertEquals(actual, null);
        }
         */

        @Test
        public void testMaxValue() {
            int expected = 12;
            int actual = ArrayChallenge.maxValue(array);
            Assert.assertEquals(actual,expected);
        }

        @Test
        public void testMinValue() {
            int expected = 2;
            int actual = ArrayChallenge.minValue(array);
            Assert.assertEquals(actual,expected);
        }

        @Test
        public void testAverageValue() {
            int expected = 6;
            int actual = ArrayChallenge.averageValue(array);
            Assert.assertEquals(actual,expected);
        }

        @Test
        public void testTotalDouble() {
            int expected = 24;
            int actual = ArrayChallenge.totalDouble(array2);
            Assert.assertEquals(actual,expected);
        }

        @Test
        public void testMaxValueDouble() {
            int expected = 9;
            int actual = ArrayChallenge.maxValueDouble(array2);
            Assert.assertEquals(actual,expected);
        }

        @Test
        public void testNumberCountDouble() {
            int expected = 15;
            int actual = ArrayChallenge.numberCountDouble(array2);
            Assert.assertEquals(actual,expected);
        }
}