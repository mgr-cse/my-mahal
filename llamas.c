#include <stdio.h>

int main() {
    int start_size, end_size;
    
    /* Getting input */
    printf("Start size: ");
    scanf("%d", &start_size);
    printf("End size: ");
    scanf("%d", &end_size);

    float llamas_then = start_size;
    float llamas_now = start_size;
    int years = 0;
    
    while (llamas_now < end_size) {
        llamas_now = llamas_then + llamas_then/3 - llamas_then/4;
        llamas_then = llamas_now;
        years++;
    }
    printf("Years: %d\n", years);
    
}