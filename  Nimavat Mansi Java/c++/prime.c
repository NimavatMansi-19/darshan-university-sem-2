#include<stdio.h>
int peime(int,int);

void main(){
    int a,i=2;
    scanf("%d",&a);
    int r=peime(a,i);
    printf("%d",r);

}
int peime(int a,int i){
    if(i==a){
        return 0;
    }
    if(a%i==0){
        return i;
    }
    else{
        return peime(a,++i);
    } 
    }
}