#include <stdio.h>
#include <limits.h>

#define MAX 100

// Function to print optimal parenthesization
void printOrder(int bracket[MAX][MAX], int i, int j) {
    if (i == j) {
        printf("A%d", i);
        return;
    }

    printf("(");

    printOrder(bracket, i, bracket[i][j]);

    printOrder(bracket, bracket[i][j] + 1, j);

    printf(")");
}

// Function for Matrix Chain Multiplication
int matrixChainMultiplication(int p[], int n) {
    int m[MAX][MAX];
    int bracket[MAX][MAX];

    // Cost is 0 when multiplying one matrix
    for (int i = 1; i < n; i++) {
        m[i][i] = 0;
    }

    // len = chain length
    for (int len = 2; len < n; len++) {

        for (int i = 1; i < n - len + 1; i++) {

            int j = i + len - 1;

            m[i][j] = INT_MAX;

            for (int k = i; k < j; k++) {

                int cost = m[i][k] +
                           m[k + 1][j] +
                           p[i - 1] * p[k] * p[j];

                if (cost < m[i][j]) {
                    m[i][j] = cost;
                    bracket[i][j] = k;
                }
            }
        }
    }

    printf("Minimum number of multiplications = %d\n", m[1][n - 1]);

    printf("Optimal Order : ");
    printOrder(bracket, 1, n - 1);

    return m[1][n - 1];
}

int main() {

    // Example:
    // A1 = 10x30
    // A2 = 30x5
    // A3 = 5x60

    int p[] = {10, 30, 5, 60};

    int n = sizeof(p) / sizeof(p[0]);

    matrixChainMultiplication(p, n);

    return 0;
}