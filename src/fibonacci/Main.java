package fibonacci;

import static java.lang.System.nanoTime;

public class Main {

    final static int numberTimes = 1000;

    public static void main(String[] args) {
        System.out.println("Starting DynamicProgramming");
        double start = nanoTime() * 1e-6;
        long res = DynamicProgramming.fibonacci(numberTimes);
        double end = nanoTime() * 1e-6;
        System.out.printf("The result was %d and the time was %.2f ms.\n", res, end-start);

//        System.out.println("Starting NaiveRecursive");
//        start = nanoTime() * 1e-6;
//        res = NaiveRecursive.fibonacci(numberTimes);
//        end = nanoTime() * 1e-6;
//        System.out.printf("The result was %d and the time was %.2f ms.\n", res, end-start);

        System.out.println("Starting RecursiveSquaring");
        start = nanoTime() * 1e-6;
        res = RecursiveSquaring.fibonacci(numberTimes);
        end = nanoTime() * 1e-6;
        System.out.printf("The result was %d and the time was %.2f ms.\n", res, end-start);

        System.out.println("Starting DivideAndConquer");
        start = nanoTime() * 1e-6;
        res = DivideAndConquer.fibonacci(numberTimes);
        end = nanoTime() * 1e-6;
        System.out.printf("The result was %d and the time was %.2f ms.\n", res, end-start);
    }
}
