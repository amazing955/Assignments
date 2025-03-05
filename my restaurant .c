#include<stdio.h>
void breakfast(){
printf("1.black tea\n");
printf("2.bread\n");
printf("3.katogo\n");

}
void lunch(){
printf("1.rice\n");
printf("2.meat\n");
printf("3.matooke\n");

}
void dinner(){
printf("1.chips\n");
printf("2.chicken\n");
printf("3.porridge\n");

}
void dessert(){
printf("1.watermellon\n");
printf("2.eggs\n");
printf("3.juice\n");

}

int main()
{
    int choice, food;
    
    while(1){
    printf("MENU\n");
    printf("1.breakfast\n");
    printf("2.lunch\n");
    printf("3.dinner\n");
    printf("4.dessert\n");
    printf("5.exit\n");
    printf("enter your choice\n");
    scanf("%d",&choice);
    if(choice==1){
    breakfast();
    printf("enter the food choice\n");
    scanf("%d",&food);
    if(food==1){
    printf("you have chosen black tea\n");
    }else if(food==2){
    printf("you have chosen bread\n");
    }else if(food==3){
    printf("you have chosen katogo\n");
    }else{
    printf("invalid entry try again\n");
    }
    }else if(choice==2){
    lunch();
    printf("enter the food choice\n");
    scanf("%d",&food);
    if(food==1){
    printf("you have chosen rice\n");
    }else if(food==2){
    printf("you have meat\n");
    }else if(food==3){
    printf("you have matooke\n");
    }else{
    printf("invalid entry try again\n");
    }
    }else if(choice==1){
    dinner();
    printf("enter the food choice\n");
    scanf("%d",&food);
    if(food==1){
    printf("you have chosen chips\n");
    }else if(food==2){
    printf("you have chosen chicken\n");
    }else if(food==3){
    printf("you have chosen porridge\n");
    }else{
    printf("invalid entry try again\n");
    }
     }else if(choice==1){
    dessert();
    printf("enter the food choice\n");
    scanf("%d",&food);
    if(food==1){
    printf("you have chosen watermelon\n");
    }else if(food==2){
    printf("you have chosen eggs\n");
    }else if(food==3){
    printf("you have chosen juice\n");
    }else{
    printf("invalid entry try again\n");
    }
    }else{
    printf("exiting menu.....thank you for entrusting us");
    break;
    }
    }
    return 0;
}