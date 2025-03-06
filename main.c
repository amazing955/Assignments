/**
 Question:
 Write a C program that calculates the average of marks obtained by a student in 3 subjects.
 That is physics, chemistry and maths. Assume for each subject, 4 different tests were conducted;
 - coursework
 - assignment
 - mid-term
 - end-of-term
 */
int registerMarks();


 #include <stdio.h>
 int main(){

    int mathsArray[4];
    int physics[4];
    int chemistry[4];
    int average[4];
    char tests[4][20] = {"coursework", "assignment", "mid-term", "end-of-term"};

    // Ask for Math Test Scores
    printf("Enter Maths Scores\n");
    for (int i = 0; i < 4; i++)
    {
        printf("  Enter Score for %s; ", tests[i]);
        // statement above will ensure we only ask 4 times
        scanf("%d", &mathsArray[i]);
    }

    printf("=======\n");
    printf("----> Maths Average score is %d\n", registerMarks(mathsArray));
    printf("=======\n");

    // Ask for physics Test Scores
    printf("Enter Physics Scores\n");
    for (int i = 0; i < 4; i++)
    {
        printf("  Enter Score for %s; ", tests[i]);
        // statement above will ensure we only ask 4 times
        scanf("%d", &physics[i]);
    }

    printf("=======\n");
    printf("----> Physics Average score is %d \n", registerMarks(physics));
    printf("=======\n");

    // Ask for chemistry Test Scores
    printf("Enter Chemistry Scores\n");
    for (int i = 0; i < 4; i++)
    {
        printf("  Enter Score for %s; ", tests[i]);
        // statement above will ensure we only ask 4 times
        scanf("%d", &chemistry[i]);
    }

    printf("=======\n");
    printf("----> Chemistry Average score is %d \n", registerMarks(chemistry));
    printf("=======\n");

    return 0;
 }

 int registerMarks(int *someArray){
    // this function takes in a parameter callend someArray
    int arrLength = sizeof(someArray) / 2;
    int sum = 0;

    for(int i=0; i<arrLength; i++){
        sum += someArray[i];
    }

    int averageScore = sum / arrLength;
    sum = 0;
    return averageScore;
 }
