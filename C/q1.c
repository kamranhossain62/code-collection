#include <stdio.h>
#include <unistd.h>

int main() {
    printf("Process ID: %d\n", getpid());
    printf("Parent Process ID: %d\n", getppid());
    printf("Group ID: %d\n", getgid());
    printf("Effective Group ID: %d\n", getegid());
    printf("User ID: %d\n", getuid());
    printf("Effective User ID: %d\n", geteuid());

    return 0;
}