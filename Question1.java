//Q1: Write a Java Program to find whether a number is prime or not.


class Solution{
    static int isPrime(int n){
        if(n<=1)
        return 0;
       for(int i=2;i<=Math.sqrt(n);i++ )
       {if(n%i==0)
         return 0;
       }
       return 1;
    }
}
