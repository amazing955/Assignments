#include <stdio.h>
registermarks();
 int main(){

    int mathsArray[4];
    int physics[4];
    int chemistry[4];
    int average[4];
    char tests[4][20] = {"coursework", "assignment", "mid-term", "end-of-term"};
    printf("Enter Maths marks\n");
    for (int i = 0; i < 4; i++)
    {
        printf("  Enter Score for %s; ", tests[i]);
        // statement above will ensure we only ask 4 times
        scanf("%d", &mathsArray[i]);
    }
    printf("\n");
    printf("Maths Average marks is %d\n", registerMarks(mathsArray));
    printf("Enter Physics marks\n");
    for (int i = 0; i < 4; i++)
    {
        printf("  Enter marks for %s; ", tests[i]);
        scanf("%d", &physics[i]);
    }

    printf("\n");
    printf("Physics Average marks is %d \n", registerMarks(physics));

    printf("Enter Chemistry marks\n");
    for (int i = 0; i < 4; i++)
    {
        printf("Enter marks for %s; ", tests[i]);
        
        scanf("%d", &chemistry[i]);
    }

    printf("\n");
    printf("Chemistry Average mark is %d \n", registerMarks(chemistry));
    

    return 0;
 }

 int registerMarks(int *myarray){
    int arrLength = sizeof(myarray) / 2;
    int sum = 0;

    for(int i=0; i<arrLength; i++){
        sum += myarray[i];
    }

    int averageScore = sum / arrLength;
    sum = 0;
    return averageScore;
 }
