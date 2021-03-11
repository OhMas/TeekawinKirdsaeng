//Teekawin 6188077
//Ekkawit 6188122
//Sec.1 
#include <stdlib.h>
#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include <time.h>
#define TIME 60
int customer_id = 0;
void *teller1();
void *teller2();
void *teller3();
//Thread Attributes
pthread_attr_t attr;
pthread_mutex_t lock = PTHREAD_MUTEX_INITIALIZER;

//Main
int main() {
pthread_t tid1,tid2,tid3;
int customer=0;
int customerrand;
int finshed=0;
int cus[120];
int length[12];
long clock=0;
long i=0;
long service1=1,service2=1,service3=1;
long service4=0,service5=0,service6=0;
long j;
long missqueue1=0;
long missqueue2=0;
long missqueue3=0; 
srand(time(NULL));
//For loop
for(i=0; i< TIME; i += 5) {
    service4 = i;
    if(service5<i)
        service5=i;
    if(service6<i)    
        service6=i;
    printf("\n==========================================");
    printf("\n%ld Minutes\n",i);
    customerrand = 5+rand()%6;
    length[clock] = customer+customerrand-finshed;
    printf("Customers in queue = %d\n",length[clock]);
    for(j = customer; j < customer + customerrand; j++) {
       cus[j] = rand()%3;
    }
    for(j=customer;j<customer + customerrand;j++){
        if(service1 < TIME && service4 < i+5 && missqueue1 > 0){
            pthread_mutex_lock(&lock);
            pthread_create(&tid1,&attr,teller1,NULL);
            customer_id++;
            service1 += 1;
            service4 += 1;
            finshed += 1;
            missqueue1 -= 1;
            pthread_mutex_unlock(&lock);
            pthread_join(tid1,NULL);
        }
        else if(service1 < TIME && cus[j]==0 && service4 < i+5){
            pthread_mutex_lock(&lock);
            pthread_create(&tid1,&attr,teller1,NULL);
            customer_id++;
            service1 += 1;
            service4 += 1;
            finshed += 1;
            pthread_mutex_unlock(&lock);
            pthread_join(tid1,NULL);
        }
        else if(cus[j]==0 && service4 >= i+5)
            missqueue1 += 1;
        if(service2 < TIME && service5 < i+5 && missqueue2 > 0){
            pthread_mutex_lock(&lock);
            pthread_create(&tid2,&attr,teller2,NULL);
            customer_id++;
            service2 += 2;
            service5 += 2;
            finshed += 1;
            missqueue2 -= 1;
            pthread_mutex_unlock(&lock);
            pthread_join(tid2,NULL);
        }
        else if(service2 < TIME && cus[j]==1 && service5 < i+5){
            pthread_mutex_lock(&lock);
            pthread_create(&tid2,&attr,teller2,NULL);
            customer_id++;
            service2 += 2;
            service5 += 2;
            finshed += 1;
            pthread_mutex_unlock(&lock);
            pthread_join(tid2,NULL);
        }
        else if(cus[j]==1 && service5 >= i+5)
            missqueue2 += 1;
        if(service3 < TIME && service6 < i+5 && missqueue3 > 0){
            pthread_mutex_lock(&lock);
            pthread_create(&tid3,&attr,teller3,NULL);
            customer_id++;
            service3 += 3;
            service6 += 3;
            finshed += 1;
            missqueue3 -= 1;
            pthread_mutex_unlock(&lock);
            pthread_join(tid3,NULL);
        }
        else if(service3 < TIME && cus[j]==2 && service6 < i+5){
            pthread_mutex_lock(&lock);
            pthread_create(&tid3,&attr,teller3,NULL);
            customer_id++;
            service3 += 3;
            service6 += 3;
            finshed += 1;
            pthread_mutex_unlock(&lock);
            pthread_join(tid3,NULL);
        }
        else if(cus[j]==2 && service6 >= i+5)
            missqueue3 += 1;
    }

    customer += customerrand;
    clock += 1;
}


//Sleep time
sleep(5);
//caclulate Average Time
float agvservicetime=0;
float avgqueuetime=0;
float avgqueuelength=0;
agvservicetime = (float)(service1+service2+service3)/(service1+(service2/2)+(service3/3));
printf("\nAverage service time = %.2f\n",agvservicetime);
avgqueuetime = (float)customer/60;
printf("Average queue wait time = %.2f\n",avgqueuetime);
for(i = 0;i<clock;i++)
    avgqueuelength += length[i];
avgqueuelength /= clock; 
printf("Average queue length = %.2f\n",avgqueuelength);
exit(0);
}

//Variable
void *teller1() {
    printf("Depositing or withdrawing service done for customer no %d\n", customer_id);
}

void *teller2() {
    printf("Cheque service done for customer no %d\n", customer_id);
}

void *teller3() {
    printf("Exchange service done for customer no %d\n", customer_id);
}



