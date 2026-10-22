#include <stdio.h>

struct Item {
    int value;
    int weight;
    float ratio;
};

void sortItems(struct Item items[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (items[j].ratio < items[j + 1].ratio) {
                struct Item temp = items[j];
                items[j] = items[j + 1];
                items[j + 1] = temp;
            }
        }
    }
}

float fractionalKnapsack(struct Item items[], int n, int capacity) {
    for (int i = 0; i < n; i++) {
        items[i].ratio = (float)items[i].value / items[i].weight;
    }

    sortItems(items, n);

    float totalValue = 0.0;
    int remainingCap = capacity;

    for (int i = 0; i < n; i++) {
        if (remainingCap == 0)
            break;

        if (items[i].weight <= remainingCap) {
            totalValue += items[i].value;
            remainingCap -= items[i].weight;
        } else {
            float fraction = (float)remainingCap / items[i].weight;
            totalValue += items[i].value * fraction;
            remainingCap = 0;
        }
    }

    return totalValue;
}

int main() {
    struct Item items[] = {
        {60, 10},
        {100, 20},
        {120, 30}
    };

    int n = 3;
    int capacity = 50;

    float maxValue = fractionalKnapsack(items, n, capacity);

    printf("Maximum value = %.2f\n", maxValue);

    return 0;
}