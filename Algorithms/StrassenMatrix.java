public class StrassenMatrix {

    static int[][] add(int A[][], int B[][]) {
        int n = A.length;
        int C[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    static int[][] sub(int A[][], int B[][]) {
        int n = A.length;
        int C[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    static int[][] strassen(int A[][], int B[][]) {
        int n = A.length;
        int C[][] = new int[n][n];

        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int size = n / 2;

        int A11[][] = new int[size][size];
        int A12[][] = new int[size][size];
        int A21[][] = new int[size][size];
        int A22[][] = new int[size][size];

        int B11[][] = new int[size][size];
        int B12[][] = new int[size][size];
        int B21[][] = new int[size][size];
        int B22[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + size];
                A21[i][j] = A[i + size][j];
                A22[i][j] = A[i + size][j + size];

                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + size];
                B21[i][j] = B[i + size][j];
                B22[i][j] = B[i + size][j + size];
            }
        }

        int M1[][] = strassen(add(A11, A22), add(B11, B22));
        int M2[][] = strassen(add(A21, A22), B11);
        int M3[][] = strassen(A11, sub(B12, B22));
        int M4[][] = strassen(A22, sub(B21, B11));
        int M5[][] = strassen(add(A11, A12), B22);
        int M6[][] = strassen(sub(A21, A11), add(B11, B12));
        int M7[][] = strassen(sub(A12, A22), add(B21, B22));

        int C11[][] = add(sub(add(M1, M4), M5), M7);
        int C12[][] = add(M3, M5);
        int C21[][] = add(M2, M4);
        int C22[][] = add(sub(add(M1, M3), M2), M6);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                C[i][j] = C11[i][j];
                C[i][j + size] = C12[i][j];
                C[i + size][j] = C21[i][j];
                C[i + size][j + size] = C22[i][j];
            }
        }

        return C;
    }

    static void printMatrix(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int A[][] = {
            {1, 2},
            {3, 4}
        };

        int B[][] = {
            {5, 6},
            {7, 8}
        };

        int C[][] = strassen(A, B);

        System.out.println("Result Matrix:");
        printMatrix(C);
    }
}