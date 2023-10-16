//Q3: Write a Java Program to reverse a string without using String inbuilt function reverse().


class Solution {
    static String revStr(String S) {
        String a = "";
        for(int i=S.length()-1;i>=0;i--){
            char ch = S.charAt(i);
            a+=ch;
        }
      //  a+=S[i];
        return a;
    }
}
