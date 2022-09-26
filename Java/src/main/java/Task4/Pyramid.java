package Task4;

public class Pyramid {
    public static void triangle(int number){
        while (number >= 0) {
            for (int i = 0; i <= number; i++) {
                System.out.print(i + " ");
            }
            number--;
            System.out.println();
        }
    }

    public static void triangleBack(int number){
        while (number >= 0) {
            for (int i = 0; i <= number; i++) {
                System.out.print(" " );
            }
            number--;
            for (int i = 0; i <= number ; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }


    public static void backTriangle(int number) {
        for (int i = number; i >= 0; i--) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
