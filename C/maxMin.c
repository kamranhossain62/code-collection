#include <stdio.h>

void maxMin(int a[], int l, int r, int *max, int *min, int depth) {
    printf("Depth %d -> Range [%d,%d]\n", depth, l, r);

    if (l == r) {
        *max = *min = a[l];
    }
    else if (r == l + 1) {
        if (a[l] > a[r]) {
            *max = a[l];
            *min = a[r];
        } else {
            *max = a[r];
            *min = a[l];
        }
    }
    else {
        int mid = (l + r) / 2;
        int max1, min1, max2, min2;

        maxMin(a, l, mid, &max1, &min1, depth + 1);
        maxMin(a, mid + 1, r, &max2, &min2, depth + 1);

        *max = (max1 > max2) ? max1 : max2;
        *min = (min1 < min2) ? min1 : min2;
    }

    printf("Depth %d -> Max=%d Min=%d\n", depth, *max, *min);
}

int main() {
    int n;

    printf("Enter size: ");
    scanf("%d", &n);

    int a[n];

    printf("Enter elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    int max, min;

    maxMin(a, 0, n - 1, &max, &min, 0);

    printf("\nFinal Max = %d\n", max);
    printf("Final Min = %d\n", min);

    return 0;
}