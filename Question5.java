//Q5: Write a Java Program to find the second-highest number in an array.
//User function Template for Java
//import java.util.Arrays;
class Solution {
    int print2largest(int arr[], int n) {
        if(n<=1)
        return -1;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1])
            return arr[i];
        }
        return -1;
    }
}
