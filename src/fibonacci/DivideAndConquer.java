package fibonacci;

public class DivideAndConquer {
    public static long fibonacci(int n) {
        long[][] f = matrixF();
        if (n == 0) return f[1][1];
        else if (n == 1) return f[0][1];
        else f = power(f, n);
        return f[0][1];
    }

    private static long[][] power(long[][] a, int n) {
        if (n == 0) return matrixI();
        else if (n == 1) return a;

        // Since n / 2 will be a int it will truncate the result so
        // we don't need to subtract one when doing the odd part.
        long[][] c = power(a,n / 2);
        c = multiply(c, c);
        if (n % 2 != 0) c = multiply(c, matrixF());
        return c;
    }

    private static long[][] multiply(long[][] a1, long[][] a2) {
        long[][] answer = new long[a1.length][a2.length];
        for (int i = 0; i < a1.length; i++)
            for (int j = 0; j < a2.length; j++)
                for (int k = 0; k < a1.length; k++)
                    answer[i][j] += a1[i][k] * a2[k][j];
        return answer;
    }

    private static long[][] matrixF() {
        return new long[][] {{1, 1}, {1, 0}};
    }

    private static long[][] matrixI() {
        return new long[][] {{1, 1,}, {1, 1,}};
    }
}
