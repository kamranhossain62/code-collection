#include<stdio.h>
int main(){
    int n;
    printf("Enter the size of the array");
    scanf("%d",&n);
    int arr[n];
    printf("Enter sorted array Elements");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
     int target;
    printf("Enter a target");
    scanf("%d",&target);
    int lo=0;
    int hi=n-1;
    while(lo<hi){
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==target){
             printf("%d is present at position %d",target,mid+1);
             break;
        }
        else if(arr[mid]<target) lo=mid+1;
        else hi=mid-1;
    }
    return 0;
}