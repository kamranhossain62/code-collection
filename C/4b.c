#include <stdio.h>
int max(int a, int b)
{
return (a > b) ? a : b;
}
int main()
{
int profit[] = {300, 200, 400, 500};
int weight[] = {2, 1, 5, 3};
int n = 4;
int W = 10;
int dp[n + 1][W + 1];
for(int i = 0; i <= n; i++)
{
for(int w = 0; w <= W; w++)
{
if(i == 0 || w == 0)
{
dp[i][w] = 0;
}
else if(weight[i - 1] <= w)
{
dp[i][w] = max(
profit[i - 1] + dp[i - 1][w - weight[i - 1]],
dp[i - 1][w]
);
}
else
{
dp[i][w] = dp[i - 1][w];
}
}
}
printf("Maximum Profit = %d\n", dp[n][W]);
return 0;
}