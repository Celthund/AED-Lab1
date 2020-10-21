package fibonacci;

import static java.lang.System.currentTimeMillis;

public class Main {

    final static int numberTimes = 20;

    public static void main(String[] args) {
        System.out.println("Starting DynamicProgramming");
        long start = currentTimeMillis();
        long res = DynamicProgramming.fibonacci(numberTimes);
        long end = currentTimeMillis();
        System.out.printf("The result was %d and the time was %d ms.\n", res, end-start);

        System.out.println("Starting NaiveRecursive");
        start = currentTimeMillis();
        res = NaiveRecursive.fibonacci(numberTimes);
        end = currentTimeMillis();
        System.out.printf("The result was %d and the time was %d. ms\n", res, end-start);

        System.out.println("Starting RecursiveSquaring");
        start = currentTimeMillis();
        res = RecursiveSquaring.fibonacci(numberTimes);
        end = currentTimeMillis();
        System.out.printf("The result was %d and the time was %d. ms\n", res, end-start);

        System.out.println("Starting DivideAndConquer");
        start = currentTimeMillis();
        res = DivideAndConquer.fibonacci(numberTimes);
        end = currentTimeMillis();
        System.out.printf("The result was %d and the time was %d. ms\n", res, end-start);
    }
}
