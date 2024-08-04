package leetcode.arrays.pascaltriangle.guesselement;

public class GuessElementInPascalTriangle {
    // Calculate combination by  r-1 C c-1 =
    // Combination formula n C r = n! / (r! * (n-r)!)

    //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    // row=3 column=2 answer=2
    private int guessElementInPascalTriangleByRowAndColumn(int rowNumber, int columnNumber) {
        int n = rowNumber - 1;
        int r = columnNumber - 1;

        int fact1 = factorial(n);
        int fact2 = factorial(r);
        int fact3 = factorial(n - r);

        int multiplication = fact2 * fact3;

        int element = fact1 / multiplication;
        return element;
    }

    private int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        GuessElementInPascalTriangle guessElementInPascalTriangle = new GuessElementInPascalTriangle();
        int element = guessElementInPascalTriangle.guessElementInPascalTriangleByRowAndColumn(3, 2);
        System.out.println(element);
    }
}
