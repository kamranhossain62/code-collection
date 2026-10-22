#include <stdio.h>
#include <stdlib.h>

struct Edge {
    int u, v, w;
};

struct Edge edge[20], mst[20];
int parent[20];

int find(int i) {
    while (parent[i])
        i = parent[i];
    return i;
}

int uni(int i, int j) {
    if (i != j) {
        parent[j] = i;
        return 1;
    }
    return 0;
}

int cmp(const void *a, const void *b) {
    return ((struct Edge *)a)->w - ((struct Edge *)b)->w;
}

int main() {

    int V = 4, E = 5;

    edge[0] = (struct Edge){0,1,10};
    edge[1] = (struct Edge){0,2,6};
    edge[2] = (struct Edge){0,3,5};
    edge[3] = (struct Edge){1,3,15};
    edge[4] = (struct Edge){2,3,4};

    qsort(edge, E, sizeof(edge[0]), cmp);

    int count = 0, cost = 0;

    for (int i = 0; i < E; i++) {

        int a = find(edge[i].u);
        int b = find(edge[i].v);

        if (uni(a, b)) {
            mst[count++] = edge[i];
            cost += edge[i].w;
        }
    }

    printf("Edges in MST:\n");

    for (int i = 0; i < count; i++)
        printf("%d -- %d = %d\n",
               mst[i].u,
               mst[i].v,
               mst[i].w);

    printf("Minimum Cost = %d", cost);

    return 0;
}