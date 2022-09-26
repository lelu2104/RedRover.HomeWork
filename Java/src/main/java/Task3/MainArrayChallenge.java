package Task3;

import static Task3.ArrayChallenge.*;

public class MainArrayChallenge {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] arrayDouble = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(total(array));
        System.out.println(minValue(array));
        System.out.println(maxValue(array));
        System.out.println(averageValue(array));
        System.out.println(totalDouble(arrayDouble));
        System.out.println(maxValueDouble(arrayDouble));
        System.out.println(numberCountDouble(arrayDouble));

    }
}
