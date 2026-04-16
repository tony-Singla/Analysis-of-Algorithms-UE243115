public class matrixmultiply {
    static int[][] multiply(int A[][], int B[][]) {
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

        int C11[][] = add(multiply(A11, B11), multiply(A12, B21));
        int C12[][] = add(multiply(A11, B12), multiply(A12, B22));
        int C21[][] = add(multiply(A21, B11), multiply(A22, B21));
        int C22[][] = add(multiply(A21, B12), multiply(A22, B22));

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

    static int[][] add(int A[][], int B[][]) {
        int n = A.length;
        int C[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    static void print(int A[][]) {
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

        int C[][] = multiply(A, B);

        System.out.println("Result:");
        print(C);
    }

}
